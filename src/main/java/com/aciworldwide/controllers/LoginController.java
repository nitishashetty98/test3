package com.aciworldwide.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aciworldwide.entities.User;
import com.aciworldwide.services.UserService;
//Presentation Layer

@Controller
public class LoginController {
	//used to invoke business layer
	@Autowired
	private UserService userService;
	
	//request processing method
	@RequestMapping("/signin")// handlermapping- to url if request comes,sign in will respond
	public String validateUser(User user,ModelMap map)
	{	//invoking business logic method of business layer(service)
		//user.setUsername("Nitisha");
		//user.setPassword("Welcome123");
		if(userService.isValid(user))
		{
			map.addAttribute("uname", user.getUsername());
			return "success";
		}
		else
			{
				map.addAttribute("logonerror", "Invalid Username/Password");
				return "login";
			}
		
	}
}
