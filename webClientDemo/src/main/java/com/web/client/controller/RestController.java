package com.web.client.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.client.dto.Employee;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	

	
	@PostMapping(
			value ="/queryParamPostEx",
			consumes={"application/json"},
			produces= {"application/json"}
			)
	
	public Employee queryParamPostEx(@RequestBody Employee employee) {
		
		System.out.println(employee);
		return employee;
	}
	
	
	@GetMapping("/testing")
	public String show() {
		return "welcome in rest template!";
	}
	
	@GetMapping("/queryParamEx")
	public String queryParamEx(@RequestParam("name") String name,@RequestParam("mobile") String mobile) {
		
		System.out.println(name +" -- "+mobile);
		//return "query Param";
		return "your name is "+name +" -- your mobile numbe is "+mobile;
	}
	
	@GetMapping("/getEmployeeList")
	public List<String> getEmployeeList() {
		
		List<String> list = new ArrayList<>();
		list.add("Firoz");
		list.add("Taha");
		list.add("Altaf");
		list.add("Mazid");
		
		return list;
	}
	

	@GetMapping(
			value ="/consumesExWithResponeEntity",
			consumes={"application/xml"},
			produces= {"application/xml"}
			)
	
	public ResponseEntity<Employee> consumesExWithResponeEntity(@RequestBody Employee employee) {
		
		System.out.println(employee);
		return new ResponseEntity<>(employee,HttpStatus.OK);
		//return   ResponseEntity.status(HttpStatus.CREATED).body(employee);

	}
	
	
	@GetMapping(
			value ="/consumesEx",
			consumes={"application/xml"},
			produces= {"application/json"}
			)
	
	public Employee consumesEx(@RequestBody Employee employee) {
		
		System.out.println(employee);
		return employee;
	}
	
	
	@GetMapping(
			value ="/producesEx",
			produces={"application/json"}
			)
	
	public Employee producesEx(@RequestBody Employee employee) {
		
		System.out.println(employee);
		return employee;
	}
	
	
	@GetMapping("/requestBodyEx")
	
	public Employee requestBodyEx(@RequestBody Employee employee) {
		
		System.out.println(employee);
		return employee;
	}
	
	
	@GetMapping("/pathParamEx/{name}/{mobile}")
	public String pathParamEx(@PathVariable("name") String name,@PathVariable("mobile") String mobile) {
		
		System.out.println("your name is "+name +" -- your mobile numbe is "+mobile);
		//return "query Param";
		return "your name is "+name +" -- your mobile numbe is "+mobile;
	}
}
