package com.hg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hg.entity.User;
import com.hg.services.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
	@Autowired
	UserService userService;
	@GetMapping("all")
	public List<User> getAllUsers() {
	return userService.findAllUsers();
	}
}
