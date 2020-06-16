package com.example.datajpa.service;

import java.util.Map;
/**
 * 
 * @author Ravishankar.kumar
 *
 */
public interface UserService {

	Map<String, Object> getUserDetailsbyFirstname(String firstname);
	Map<String, Object> getUserDetailsbyFirstnameAndLastname(String firstname, String lastname);
	Map<String, Object> getUserDetailsByDate(String startdate);
	Map<String, Object> getUserDetailsbyAge(int age);

}
