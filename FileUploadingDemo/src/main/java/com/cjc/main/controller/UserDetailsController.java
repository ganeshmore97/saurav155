package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.main.entity.UserDetails;
import com.cjc.main.servicei.ServiceI;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/user")
public class UserDetailsController {
 @Autowired
 ServiceI si;
	
	@PostMapping("/user")
	public ResponseEntity<UserDetails> CreateUser(@RequestPart ("profile")MultipartFile profileImg,
			                                      @RequestPart ("aadhar")MultipartFile aadharCard,
			                                      @RequestPart ("pancard") MultipartFile pancard,
			                                      @RequestPart ("user") String userJson
		                                      )
	{
		ObjectMapper om=new ObjectMapper();
		try {
			UserDetails userDetails=om.readValue(userJson, UserDetails.class);
			
			UserDetails udb=si.saveUserDetails(userDetails,profileImg,aadharCard,pancard);
			return new ResponseEntity<UserDetails>(udb,HttpStatus.CREATED);
	}
		catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
