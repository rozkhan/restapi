package com.web.client.dto;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	private String name;
	private String mobile;
	
	// getter setter
	public Employee() {}
	public Employee(String name, String mobile) {
		
		this.name = name;
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", mobile=" + mobile + "]";
	}
	
	
}
