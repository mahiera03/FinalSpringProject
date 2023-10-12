package com.example.FinalAssessment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FinalAssessment.entity.User;
import com.example.FinalAssessment.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
	
	@Autowired
    private UserService userService;
    @PostMapping("/new")
    public User postNewUser(@RequestBody User user){
return userService.postNewUser(user);
    }
}
