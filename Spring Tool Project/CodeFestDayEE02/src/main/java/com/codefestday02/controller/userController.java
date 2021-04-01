package com.codefestday02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codefestday02.entities.User;
import com.codefestday02.service.userService;

@RestController
@RequestMapping(path = "/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class userController {
	
	@Autowired
	userService userService;
	
	@PostMapping(path = "/getUserAll")
	public List<User> getusers() {
		return userService.getUserAll();
	}
	
	@PostMapping(path = "/addUser")
	public User adduser(@RequestBody @RequestParam int id, @RequestBody @RequestParam String name,@RequestBody @RequestParam String un, @RequestBody @RequestParam String pw,@RequestBody @RequestParam int age, @RequestBody @RequestParam int tele) {
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setUsername(un);
		user.setPassword(pw);
		user.setAge(age);
		user.setTelephone(tele);
		return userService.saveUser(user);
	}
}
