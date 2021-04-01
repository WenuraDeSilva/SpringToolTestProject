package com.codefestday02.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codefestday02.entities.User;
import com.codefestday02.repository.userRepository;

@Service
public class userService {

	
	@Autowired
	userRepository userRepo;
	public List<User> getUserAll(){
		List<User> userList = userRepo.findAll();
		return userList;
	}
	
	
	public User saveUser(User user) {
		return userRepo.save(user);
	}
	
}
