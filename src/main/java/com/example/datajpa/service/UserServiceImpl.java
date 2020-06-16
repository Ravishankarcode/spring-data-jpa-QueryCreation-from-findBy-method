package com.example.datajpa.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.datajpa.model.User;
import com.example.datajpa.repo.UserRepo;
import com.example.datajpa.utils.DateUtil;
/**
 * 
 * @author Ravishankar.kumar
 *
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepo userRepo;

	@Override
	public Map<String, Object> getUserDetailsbyFirstname(String firstname) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<User> firstNameList = userRepo.findByFirstname(firstname);
		List<User> firstNameLikeList = userRepo.findByFirstnameLike(firstname);
		List<User> firstNameNotLikeList = userRepo.findByFirstnameNotLike(firstname);
		List<User> firstNameContainingList = userRepo.findByFirstnameContaining(firstname);
		List<User> firstNameStartingWithList = userRepo.findByFirstnameStartingWith(firstname);
		List<User> firstNameEndingWithList = userRepo.findByFirstnameEndingWith(firstname);
		List<User> firstNameIgnoreCaseList = userRepo.findByFirstnameIgnoreCase(firstname);
		
		map.put("firstNameList", firstNameList);
		map.put("firstNameLikeList", firstNameLikeList);
		map.put("firstNameNotLikeList", firstNameNotLikeList);
		map.put("firstNameContainingList", firstNameContainingList);
		map.put("firstNameStartingWithList", firstNameStartingWithList);
		map.put("firstNameEndingWithList", firstNameEndingWithList);
		map.put("firstNameIgnoreCaseList", firstNameIgnoreCaseList);
		
		return map;
	}

	@Override
	public Map<String, Object> getUserDetailsbyFirstnameAndLastname(String firstname, String lastname) {

		Map<String, Object> map = new HashMap<String, Object>();
		
		List<User> lastNameNotList = userRepo.findByLastnameNot(lastname);
		List<User> firstNameAndLastNameList = userRepo.findByLastnameAndFirstname(lastname, firstname);
		List<User> firstNameOrLastNameList = userRepo.findByLastnameOrFirstname(lastname, firstname);
		List<User> activeUserList = userRepo.findByActiveTrue();
		List<User> inactiveUserList = userRepo.findByActiveFalse();
		
		map.put("lastNameNotList", lastNameNotList);
		map.put("firstNameAndLastNameList", firstNameAndLastNameList);
		map.put("firstNameOrLastNameList", firstNameOrLastNameList);
		map.put("activeUserList", activeUserList);
		map.put("inactiveUserList", inactiveUserList);
		
		return map;
	}

	@Override
	public Map<String, Object> getUserDetailsByDate(String startdate) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		Date date = DateUtil.convertStringToDate(startdate);
		List<User> afterStartDateValues = userRepo.findByStartDateAfter(date);
		List<User> beforeStartDateValues = userRepo.findByStartDateBefore(date);
		List<User> startDateBetweenValues = userRepo.findByStartDateBetween(new Date(),date);

		map.put("afterStartDateValues", afterStartDateValues);
		map.put("beforeStartDateValues", beforeStartDateValues);
		map.put("startDateBetweenValues", startDateBetweenValues);
		
		return map;
	}

	@Override
	public Map<String, Object> getUserDetailsbyAge(int age) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		int ageValues [] = {35,43,24};
		
        List<User> ageLessThenValue = userRepo.findByAgeLessThan(age);
        List<User> ageLessThenEqualValue = userRepo.findByAgeLessThanEqual(age);
        List<User> ageGreaterThenValue = userRepo.findByAgeGreaterThan(age);
        List<User> ageGreaterThenEqualValue = userRepo.findByAgeGreaterThanEqual(age);
        List<User> ageIsNullValue = userRepo.findByAgeIsNull();
        List<User> ageIsNotNullValue = userRepo.findByAgeNotNull();
        List<User> ageInValue = userRepo.findByAgeIn(ageValues);
        List<User> ageNotInValue = userRepo.findByAgeNotIn(ageValues);
        List<User> ageOrderByLastnameDesc = userRepo.findByAgeOrderByLastnameDesc(age);
        
        map.put("ageLessThenValue", ageLessThenValue);
        map.put("ageLessThenEqualValue", ageLessThenEqualValue);
        map.put("ageGreaterThenValue", ageGreaterThenValue);
        map.put("ageGreaterThenEqualValue", ageGreaterThenEqualValue);
        map.put("ageIsNullValue", ageIsNullValue);
        map.put("ageIsNotNullValue", ageIsNotNullValue);
        map.put("ageInValue", ageInValue);
        map.put("ageNotInValue", ageNotInValue);
        map.put("ageOrderByLastnameDesc", ageOrderByLastnameDesc);
     
		return map;
	}


}
