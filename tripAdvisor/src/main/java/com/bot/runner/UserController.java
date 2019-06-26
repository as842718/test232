package com.bot.runner;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bot.runner.user.User;
import com.bot.runner.user.UserService;
import com.bot.runner.user.UserServiceImp;


@RestController
public class UserController {
	
	UserService u = new UserServiceImp();

	@RequestMapping(path = "/getUserDetails")
	public List<User> getUserDetails() {
	return u.getUserDetails();
	}
	
	@RequestMapping(method=RequestMethod.POST,path="/deatils")
	public void addDetails(@RequestBody User user) {	
		 u.addUserDetails(user);
	}
	
	
}
