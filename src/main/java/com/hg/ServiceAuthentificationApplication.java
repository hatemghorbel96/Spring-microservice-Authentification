package com.hg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.hg.entity.Role;
import com.hg.entity.User;
import com.hg.services.UserService;

import jakarta.annotation.PostConstruct;
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceAuthentificationApplication {
	@Autowired
	UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(ServiceAuthentificationApplication.class, args);
	}
	
	/*
	 * @PostConstruct void init_users() {
	 * 
	 * 
	 * userService.addRole(new Role(null,"ADMIN")); userService.addRole(new
	 * Role(null,"USER")); userService.saveUser(new User(null,"hatem","123",null));
	 * 
	 * userService.addRoleToUser("hatem", "ADMIN");
	 * 
	 * 
	 * }
	 */

}
