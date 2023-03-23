package com.sujith.Learnloginsignup.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.sujith.Learnloginsignup.model.User;
import com.sujith.Learnloginsignup.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService
{
	User save(UserRegistrationDto registrationDto);

}
