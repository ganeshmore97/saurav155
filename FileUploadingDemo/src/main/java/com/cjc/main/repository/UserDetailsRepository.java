package com.cjc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.main.entity.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {

}
