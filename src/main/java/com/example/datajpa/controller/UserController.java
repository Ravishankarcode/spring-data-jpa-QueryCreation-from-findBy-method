package com.example.datajpa.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.datajpa.service.UserService;
/**
 * 
 * @author Ravishankar.kumar
 *
 */
@RestController
public class UserController{
	
	@Autowired
	UserService userService;
	
    @GetMapping("/getUserDetailsbyFirstname/{firstname}")
    public Map<String, Object> getUserDetails(@PathVariable(value = "firstname") String firstname) {
        return userService.getUserDetailsbyFirstname(firstname);
    }
	
    @GetMapping("/getUserDetailsbyFirstname/{firstname}/{lastname}")
    public Map<String, Object> getUserDetailsbyFirstnameAndLastname(@PathVariable(value = "firstname") String firstname,
    		@PathVariable(value = "lastname") String lastname) {
        return userService.getUserDetailsbyFirstnameAndLastname(firstname, lastname);
    }

    @GetMapping("/getUserDetailsByDate/{startdate}")
    public Map<String, Object> getUserDetailsByDate(@PathVariable(value = "startdate") String startdate) {
        return userService.getUserDetailsByDate(startdate);
    }
    
    @GetMapping("/getUserDetailsbyAge/{age}")
    public Map<String, Object> getUserDetailsbyAge(@PathVariable(value = "age") int age) {
        return userService.getUserDetailsbyAge(age);
    }
}
