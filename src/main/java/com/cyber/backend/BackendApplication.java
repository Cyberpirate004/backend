package com.cyber.backend;


import com.cyber.backend.model.Role;
import com.cyber.backend.model.User;
import com.cyber.backend.model.UserRole;
import com.cyber.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("starting code");
//
//		User user =new User();
//
//		user.setUsername("CyberPirates");
//		user.setPassword("CyberPirates@12345");
//		user.setFirstName("Sujal");
//		user.setLastName("Sahu");
//		user.setEmail("sujalsahu7898@gmail.com");
//		user.setPhone("7898388516");
//		user.setProfile("default.png");
//
//		Role role1=new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("ADMIN");
//
//		Set<UserRole> userRoleSet=new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//
//		userRoleSet.add(userRole);
//
//		User user1 = this.userService.createUser(user , userRoleSet);
//		System.out.println("UserName = "+user1.getUsername());

	}

}
