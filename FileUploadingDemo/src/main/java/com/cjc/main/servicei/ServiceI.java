package com.cjc.main.servicei;

import org.springframework.web.multipart.MultipartFile;

import com.cjc.main.entity.UserDetails;

public interface ServiceI {

	public UserDetails saveUserDetails(UserDetails userDetails, MultipartFile profileImg, MultipartFile aadharCard,
			MultipartFile pancard);

}
