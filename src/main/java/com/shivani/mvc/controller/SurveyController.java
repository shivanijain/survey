package com.shivani.mvc.controller;

import com.shivani.mvc.Service.SurveyService;
import com.shivani.mvc.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

/**
 * Created by Shivani on 27-01-2018.
 */

@RestController
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @GetMapping("surveys/{surveyId}/questions")
    public List<Question> getRetrieveSurveyQuestion(@PathVariable String surveyId){
        return surveyService.retrieveQuestions(surveyId);
    }

    @GetMapping("surveys/{surveyId}/questions/{questionId}")
    public Question getQuestion(@PathVariable String surveyId, @PathVariable String questionId) {
        return surveyService.retrieveQuestion( surveyId, questionId );
    }

    @PostMapping("surveys/{surveyId}/questions")
    public ResponseEntity<Void> addSurveyQuestion(@PathVariable String surveyId,@RequestBody Question newQuestion){
        Question question =  surveyService.addQuestion(surveyId,newQuestion);
        if( null == question ){
            return ResponseEntity.noContent().build();
        }
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(question.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
