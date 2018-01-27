package com.shivani.mvc.Service;

import org.springframework.stereotype.Component;

@Component
public class welcomeService {
    public String getWelcomeMessage() {
        return "Welcome to Rest.@RestController will not return view and has implicit @ResponseBody!!!";
    }
}