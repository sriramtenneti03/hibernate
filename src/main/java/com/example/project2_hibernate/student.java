package com.example.project2_hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	public student() {
	super();
	// TODO Auto-generated constructor stub
}
	public student(int id, String name, String email, String password, long phonenumber) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.password = password;
	this.phonenumber = phonenumber;
}
	public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public long getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(long phonenumber) {
	this.phonenumber = phonenumber;
}
	private String name;
	private String email;
	private String password;
	private long phonenumber;
}
