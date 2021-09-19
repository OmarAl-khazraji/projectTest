package com.csis3275.model_oal_06;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class user_oal_06 {
	@NotBlank(message=" You must enter a first name. ")
	private String firstName;
	
	
	@Size(min=2, max=16, message="Your last name must be between 2 and sixteen characters")
	private String lastName;

	@Email
	private String email;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull
	private Date dob;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	

}
