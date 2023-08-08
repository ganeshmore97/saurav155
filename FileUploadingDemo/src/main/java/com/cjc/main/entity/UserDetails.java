package com.cjc.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer userId;
	private String userName;
	private String userEmail;
	private String contactNumber;
	private byte[] profileImage;
	private byte[] aadharCard;
	private byte[] panCard;
}
