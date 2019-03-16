package com.example.async.controller;

import com.example.async.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {

    @Autowired
    private UserService userService;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/user")
    public String getUsername(){
        logger.info("==START== thread in controller, " + Thread.currentThread().getId());
        userService.generateAllUserWithAsync();
        logger.info("==END== thread in controller, " + Thread.currentThread().getId());
        return "rkrithcat";
    }
}
