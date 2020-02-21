package com.aciworldwide.services;

import org.springframework.stereotype.Service;

import com.aciworldwide.entities.User;
//Buisness Layer Interface - 

public interface UserService {
	//Buisness Logic method specification
	boolean isValid(User user);

}
