package com.hg.services;

import java.util.List;

import com.hg.entity.Role;
import com.hg.entity.User;





public interface UserService {
	


	
	User saveUser(User user);
	User updateUser(User u);
	User getUser(Long id);
	User findUserByUsername (String username);

	List<User> findAllUsers();

	User updatepasswordbyId(User u);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);

}
