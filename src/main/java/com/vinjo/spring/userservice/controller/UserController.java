package com.vinjo.spring.userservice.controller;

import com.vinjo.spring.userservice.model.User;
import com.vinjo.spring.userservice.repository.UserRepository;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(path = "greeting" , method = RequestMethod.GET)
    public String greetings() {
        return "Hello World";
    }

    @RequestMapping(path = "user", method = RequestMethod.POST)
    public  void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
