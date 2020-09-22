package com.company.bulletinboard.service;

import com.company.bulletinboard.controller.dto.UserRegistrationDto;
import com.company.bulletinboard.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);
}
