package com.hg.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.hg.entity.Role;
import com.hg.entity.User;



public interface RoleRepository extends JpaRepository<Role, Long>{

	Role findByRole(String role);

}

