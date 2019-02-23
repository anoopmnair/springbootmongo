package com.anp.mongo.mongosample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anp.mongo.mongosample.model.User;
import com.anp.mongo.mongosample.repository.UserRepository;

@RestController
public class UserConroller {

	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST,consumes="aplication/json")
	public User addNewUsers(@RequestBody User user) {
		
		return userRepository.save(user);
	}
}
