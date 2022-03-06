package com.iconerp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iconerp.entities.DesignationEntity;
@Repository 
public interface DesignationRepo extends JpaRepository<DesignationEntity, Long> {

}
