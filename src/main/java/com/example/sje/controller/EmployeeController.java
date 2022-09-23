package com.example.sje.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sje.model.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping("/employee")
	public Employee getEmployee() {
		Employee e=new Employee();
		e.setEmpId(103051);
		e.setName("Ashwini Gunti");
		e.setDesignation("SSE");
		e.setSalary(150000);
		return e;
	}

}
