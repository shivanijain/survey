package com.shivani.mvc.controller;

import com.shivani.mvc.Service.welcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Shivani on 27-01-2018.
 */
@RestController
public class WelcomeController {

    @Autowired
    welcomeService ws;
    @RequestMapping("/")
    public String welcomeMessage() {
        return ws.getWelcomeMessage();
    }
}
