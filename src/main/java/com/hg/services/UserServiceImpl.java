package com.hg.services;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hg.entity.Role;
import com.hg.entity.User;
import com.hg.repository.RoleRepository;
import com.hg.repository.UserRepository;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class UserServiceImpl implements UserService{
	 @Autowired
		UserRepository userRep;
	 @Autowired
	 RoleRepository roleRep;
	 

		@Autowired
		BCryptPasswordEncoder bCryptPasswordEncoder;
		
		@Override
		public User saveUser(User user) {
			
			user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
			return userRep.save(user);
		}
		
		@Override
		public User updateUser(User user) {
			user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
			return userRep.save(user);
		}
		
		@Override
		public User updatepasswordbyId(User u) {
			u.setPassword(bCryptPasswordEncoder.encode(u.getPassword()));
			return userRep.save(u);
		}
		
		

		@Override
		public User findUserByUsername(String username) {
			return userRep.findByUsername(username);
		}

		

	

		@Override
		public List<User> findAllUsers() {
		
			return userRep.findAll() ;
		}


		@Override
		public User getUser(Long id) {
		
			return  userRep.findById(id).get();
		}
		
		
		@Override
		public User addRoleToUser(String username, String rolename) {
		User usr = userRep.findByUsername(username);
		Role r = roleRep.findByRole(rolename);
		usr.getRoles().add(r);
		return usr;
		}
		@Override
		public Role addRole(Role role) {
		return roleRep.save(role);
		}

		  

}
