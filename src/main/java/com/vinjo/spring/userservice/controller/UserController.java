package com.vinjo.spring.userservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(path = "greeting" , method = RequestMethod.GET)
    public String greetings() {
        return "Hello World";
    }
}
