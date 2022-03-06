package com.iconerp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iconerp.entities.DesignationEntity;
import com.iconerp.entities.UserEntity;
import com.iconerp.repositories.DesignationRepo;
import com.iconerp.repositories.UserRepo;

@RestController
@RequestMapping(path = "/api/v1")
public class UserController {
	@Autowired
	private DesignationRepo DesignationRepo;
	@Autowired
	private UserRepo userRepo;
	
	@GetMapping("/User")
	public List<UserEntity> addUser() {
		List<UserEntity> userList;
		userList=userRepo.findAll();
		return userList;
	 
	}
	@PostMapping("/User")
	public List<UserEntity> getUser() {
		List<UserEntity> userList;
		userList=userRepo.findAll();
		return userList;
	 
	}
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/validateUser")
	public  UserEntity  validateUser( @RequestBody List<UserEntity> userParam) {
		
		List<UserEntity> u= userRepo.findByName(userParam.get(0).getName() );
		UserEntity ue=new UserEntity();
		for (UserEntity userEntity : u) {
			if(userEntity.getId()==userParam.get(0).getId()) {
				ue=userEntity;
			}
		}

		System.out.println(">> "+u);
		
//		List<String> userList=new ArrayList<String>();
//		Boolean b= userRepo.equals(desParam.get(0));
//		 userList.add(u.toString());
		 
		 
		return ue;
	 
	}
}
