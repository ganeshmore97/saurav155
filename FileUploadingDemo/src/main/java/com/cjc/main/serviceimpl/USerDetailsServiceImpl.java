package com.cjc.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.main.entity.UserDetails;
import com.cjc.main.repository.UserDetailsRepository;
import com.cjc.main.servicei.ServiceI;

@Service
public class USerDetailsServiceImpl implements ServiceI {

	@Autowired
	UserDetailsRepository udr;
	@Override
	public UserDetails saveUserDetails(UserDetails userDetails, MultipartFile profileImg, MultipartFile aadharCard,
			MultipartFile pancard) {
		try {
			userDetails.setProfileImage(profileImg.getBytes());
			userDetails.setAadharCard(aadharCard.getBytes());
			userDetails.setPanCard(pancard.getBytes());
			return udr.save(userDetails);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	
}
