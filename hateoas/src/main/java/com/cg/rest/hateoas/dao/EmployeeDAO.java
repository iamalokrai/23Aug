package com.cg.rest.hateoas.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

import com.cg.rest.hateoas.pojo.Employee;

public class EmployeeDAO {
	List<Employee> employee;
	public void createEmployee() {
		Employee alok = new Employee("Alok", "Analyst", "7985254250", "alokrai697@gmail.com");
		Employee udit = new Employee("Udit", "Analyst", "8585652545", "uditk187@gmail.com");
		Employee shivam = new Employee("Shivam", "Analyst", "9810253652", "shivam123@gmail.com");
		Employee aditya = new Employee("Aditya", "Analyst", "7985232321", "aditya037@gmail.com");
		employee = new ArrayList<>(Arrays.asList(alok,udit,shivam,aditya));

		/*Link link1 = ControllerLinkBuilder.linkTo(EmployeeDAO.class).slash(alok.getName()).withRel("Employee Detail");
		alok.add(link1);
		Link link2 = ControllerLinkBuilder.linkTo(EmployeeDAO.class).slash(udit.getName()).withRel("Employee Detail");
		udit.add(link2);
		Link link3 = ControllerLinkBuilder.linkTo(EmployeeDAO.class).slash(shivam.getName()).withRel("Employee Detail");
		shivam.add(link3);
		Link link4 = ControllerLinkBuilder.linkTo(EmployeeDAO.class).slash(aditya.getName()).withRel("Employee Detail");
		aditya.add(link4);*/
		
	}
	
	public List<Employee> viewEmployee(){
		createEmployee();
		return employee;
	}
	
	public Employee getEmployeeByName(String name) {
		return employee.stream().filter(e -> e.getName().equals(name)).findAny().get();
	}
	
	/*public Employee getEmployeeByDesignation(String designation) {
		return employee.stream().filter(e -> e.getDesignation().equals(designation)).findAny().get();
	}*/

	public void addEmployee(Employee emp) {
		employee.add(emp);
	}

	public void updateEmployee(String name,Employee emp) {
		for(int i=0;i<employee.size();i++) {
			Employee e = employee.get(i);
			if(e.getName().equals(name)) {
				employee.set(i, emp);
				return;
			}
		}
	}

	public void deleteEmployee(String name) {
		employee.removeIf(e -> e.getName().equals(name));
	}

	
	

}


