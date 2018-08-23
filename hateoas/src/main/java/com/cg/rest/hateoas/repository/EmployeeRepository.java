package com.cg.rest.hateoas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.rest.hateoas.pojo.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {


}