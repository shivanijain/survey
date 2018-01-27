package com.shivani.mvc.model;

import java.util.List;

/**
 * Created by Shivani on 27-01-2018.
 */
public class Survey {
    private String id;
    private String title;
    private String desc;
    private List<Question> questions;

    public Survey(String id, String title, String desc, List<Question> questions) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.questions = questions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
