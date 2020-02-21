package com.aciworldwide.services;

import org.springframework.stereotype.Service;

import com.aciworldwide.entities.User;
//Business ayer Interface Implementor
@Service
public class UserServiceImpl implements UserService {

	@Override
	public boolean isValid(User user) {
		// TODO Auto-generated method stub
		//Business logic
		if(user!=null && user.getUsername().equals("Nitisha") && user.getPassword().equals("Welcome123"))
			return true;
		else
			return false;
	}

}
