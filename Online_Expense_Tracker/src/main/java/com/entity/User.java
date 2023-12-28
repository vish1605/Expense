package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="full_name")
	private String fullName;
	
	private String email;
	private String password;
	private String about;
	public User() {
		super();
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public User(String fullName, String email, String password, String about) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.about = about;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", email=" + email + ", password=" + password + ", about="
				+ about + "]";
	}
	
	
	
	

}
