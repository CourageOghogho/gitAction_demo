package com.courage.gitactiondemo.controllers;

import com.courage.gitactiondemo.entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/user")
    public ResponseEntity<User> showUser(){
        return new ResponseEntity<User>(new User(2,"Courage"),HttpStatus.ACCEPTED);
    }
}
