package com.cg.rest.hateoas.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.hateoas.ResourceSupport;

@Entity
public class Employee extends ResourceSupport {
	
	@Id
	private String name;
	private String designation;
	private String contactNumber;
	private String emailId;

	public Employee(String name, String designation, String contactNumber, String emailId) {
		super();
		this.name = name;
		this.designation = designation;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", contactNumber=" + contactNumber
				+ ", emailId=" + emailId + "]";
	}

}
