package com.iconerp.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_users")

public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String status;
	@Column
	private String password;
	@Column
	private String phone_number; 
	
	
 
	@OneToOne
	private DesignationEntity designationEntityObj;

//	@OneToMany
//	@JoinColumn(name = "designation_id")
//	private List<DesignationEntity> designationEntity;

	public UserEntity() {
		super();
	}

	public UserEntity(String name) {
		super();
		this.name = name;
		
	}
	public UserEntity(String name, DesignationEntity designationEntityObj) {
		super();
		this.name = name;
		this.designationEntityObj = designationEntityObj;
	}
	
	
	
	
	
	public UserEntity(  String name, String email, String status, String password, String phone_number,
			DesignationEntity designationEntityObj) {
		super(); 
		this.name = name;
		this.email = email;
		this.status = status;
		this.password = password;
		this.phone_number = phone_number;
		this.designationEntityObj = designationEntityObj;
	}

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	
	
	
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the phone_number
	 */
	public String getPhone_number() {
		return phone_number;
	}

	/**
	 * @param phone_number the phone_number to set
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	/**
	 * @return the designationEntityObj
	 */
	public DesignationEntity getDesignationEntityObj() {
		return designationEntityObj;
	}

	/**
	 * @param designationEntityObj the designationEntityObj to set
	 */
	public void setDesignationEntityObj(DesignationEntity designationEntityObj) {
		this.designationEntityObj = designationEntityObj;
	}

}
