package net.project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
 private Long id;
 private String first_name;
 private String last_name;
 private String Sex;
 private Long Age;
 private String email_id;
 private Long Phone_Number;
 private Long Aadhar_number;
public Customer() {
	
}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getSex() {
	return Sex;
}
public void setSex(String sex) {
	Sex = sex;
}
public Long getAge() {
	return Age;
}
public void setAge(Long age) {
	Age = age;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
public Long getPhone_Number() {
	return Phone_Number;
}
public void setPhone_Number(Long phone_Number) {
	Phone_Number = phone_Number;
}
public Long getAadhar_number() {
	return Aadhar_number;
}
public void setAadhar_number(Long aadhar_number) {
	Aadhar_number = aadhar_number;
}

	
}
