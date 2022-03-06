package com.iconerp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "tb_designation")
public class DesignationEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;

	@Column
	private String designation_name;
//	@ManyToOne
//	private UserEntity User;
//	
	
	
	
	
	
	public DesignationEntity() {
		super();
	}
	public DesignationEntity( String designation_name) {
		super(); 
		this.designation_name = designation_name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
 
	/**
	 * @return the designation_name
	 */
	public String getDesignation_name() {
		return designation_name;
	}
	/**
	 * @param designation_name the designation_name to set
	 */
	public void setDesignation_name(String designation_name) {
		this.designation_name = designation_name;
	}
 
	
	
	
}
