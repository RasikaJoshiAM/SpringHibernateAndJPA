package com.upgrad.movieapp.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cutomerId;
	@Column(name="first_name",length = 20,nullable = false)
	private String firstName;
	@Column(length = 20)
	private String lastName;
	@Column(length = 20,nullable = false,unique = true)
	private String userName;
	@Column(length = 20,nullable = false)
	private String password;
	@Column(nullable = false)
	private LocalDateTime dateOfBirth;
	
	
	public int getCutomerId() {
		return cutomerId;
	}
	public void setCutomerId(int cutomerId) {
		this.cutomerId = cutomerId;
	}
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Customer [cutomerId=" + cutomerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", userName=" + userName + ", password=" + password + ", dateOfBirth=" + dateOfBirth + "]";
	}

}
