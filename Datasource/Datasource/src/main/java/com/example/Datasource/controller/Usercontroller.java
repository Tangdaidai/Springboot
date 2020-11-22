package com.example.Datasource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Datasource.domain.User;
import com.example.Datasource.mapper.UserMapper;

@RestController
public class Usercontroller {

	 @Autowired
	    private UserMapper userMapper;

	    @GetMapping("/user/{userId}")
	    public User getUser(@PathVariable Integer userId){
	        User user = userMapper.getUser(userId);
	        return user;
	    }
}
