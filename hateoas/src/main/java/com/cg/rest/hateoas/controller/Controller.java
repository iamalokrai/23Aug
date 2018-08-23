package com.cg.rest.hateoas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rest.hateoas.dao.EmployeeDAO;
import com.cg.rest.hateoas.pojo.Employee;
import com.cg.rest.hateoas.service.EmployeeService;

@RestController
public class Controller {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/hello")
	public String sayHello(String name) {
		return "Hello " + name;
	}
	
	@RequestMapping("/Employees")
	public List<Employee> viewEmployee(){
		return service.viewEmployee();
	}
	
	@RequestMapping("/Employees/{name}")
	public Employee getEmployeeByName(@PathVariable String name) {
		return service.viewById(name);
	}
	
	/*@RequestMapping("/Employees/designation/{designation}")
	public Employee getEmployeeByDesignation(@PathVariable String designation) {
		return dao.getEmployeeByDesignation(designation);
	}*/
	
	@RequestMapping(value="/Employees", method = RequestMethod.POST)
	public void addEmployee(@RequestBody Employee emp) {
		service.addEmployee(emp);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value ="/Employees/{name}")
	public void updateEmployee(@PathVariable String name, @RequestBody Employee emp ) {
		service.updateEmployee(name,emp);
	}
	
	@RequestMapping(value="/Employees/{name}", method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable String name) {
		service.deleteEmployee(name);
	}

}
