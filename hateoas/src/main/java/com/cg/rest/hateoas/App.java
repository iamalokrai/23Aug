package com.cg.rest.hateoas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.rest.hateoas.pojo.Employee;
import com.cg.rest.hateoas.service.EmployeeService;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
    
    public CommandLineRunner populateEmployee(EmployeeService service) {
    	return (args) -> {
    		service.addEmployee(new Employee("Alok", "analyst", "81769555074", "alokrai697@gmail.com"));
    	};
    }
}
