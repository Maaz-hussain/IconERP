package com.iconerp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

 
import com.iconerp.entities.DesignationEntity;
import com.iconerp.entities.UserEntity;
import com.iconerp.repositories.DesignationRepo;
import com.iconerp.repositories.UserRepo;

@RestController
@RequestMapping(path = "/api/v1")
public class DesignationController {
	StringBuffer b=new StringBuffer("");
	

	@Autowired
	private DesignationRepo DesignationRepo;
	@Autowired
	private UserRepo userRepo;
	

	@PostMapping("/addDesignation")
	public void addDesignation(@RequestBody List<DesignationEntity> desParam) {
		 
		
	
		
	DesignationEntity de=new DesignationEntity(desParam.get(0).getDesignation_name());
	DesignationRepo.save(de);
	
	 
	userRepo.save(new UserEntity("Maaz",de));
////	
		
		
//	userRepo.save(new UserEntity("Maaz",desParam));
	
	}
}
