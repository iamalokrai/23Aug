package com.cg.rest.hateoas.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.rest.hateoas.pojo.Employee;
import com.cg.rest.hateoas.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public List<Employee> viewEmployee() {
		return repository.findAll();
	}

	public void addEmployee(Employee emp) {
		repository.save(emp);
	}

	public void deleteEmployee(String name) {
		repository.deleteById(name);
	}

	public Employee viewById(String name) {
		return repository.findById(name).get();
	}
	
	public void updateEmployee(String name,Employee employee) {
		repository.save(employee);
	}
}
