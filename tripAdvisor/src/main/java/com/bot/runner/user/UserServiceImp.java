package com.bot.runner.user;

import java.util.Arrays;
import java.util.List;

public class UserServiceImp implements UserService {
	
private List<User> details = Arrays.asList(
			new User("Ankur","user1234","12548","user")	
			);
	
public List<User> getUserDetails() {
	return details;
	}

public void addUserDetails(User userdeatils) {
		details.add(userdeatils);				
	}


}