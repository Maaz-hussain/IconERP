package com.iconerp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iconerp.entities.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long> {

	

    List<UserEntity> findByName(String name );
	
}
