package com.cognizant.bmi.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cognizant.bmi.bean.User;

@Service
public class BMIService{
	
	public static List<String> genderType=new ArrayList<String>();
public 	static Map<Integer,User> userList=new HashMap<>();
	private static int userId=1000;
	
	public BMIService() {
		genderType.add("Male");
		genderType.add("Female");
		genderType.add("Others");
	}

//add the code as per the requirement
	
	public User addUserDetails(User user) {
	    user.setUserId(++userId);
		userList.put(userId, user);
		return user;
	}

	
	public double calculateBMI(User user) {
		  // multiplication by 100*100 for cm to m conversion
	    
	     return Math.ceil((100*100*user.getWeight())/(user.getHeight()*user.getHeight()));
	}
	
	public String getBMIStatus(double bmi) {
	    String message = "You are ";
		if(bmi<18.5) {
		    message += "underweight";
		} else if(bmi<25) {
		    message += "normal";
		} else if(bmi<30) {
		    message += "overweight";
		} else {
		    message += "obese";
		}
		return message;
	}

}
