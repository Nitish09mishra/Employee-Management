package com.nitish.employeeManagement.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nitish.employeeManagement.models.EmployeeModel;
import com.nitish.employeeManagement.services.EmployeeServices;

@RestController
public class ViewController {
	
	@Autowired
	private EmployeeServices employeeServices; 
	
	// ..........................................................create new employee in the database........................................
	@PostMapping("/")
	public EmployeeModel createEmployeeHandler(@RequestBody EmployeeModel emp) {
		return employeeServices.createEmployee(emp);
		
	}
		
		
	// ..........................................................get a list of all the employees........................................
	@GetMapping("/employees")
	public List<EmployeeModel> getEmployeesHandler() {
		
		List<EmployeeModel> list= employeeServices.findEmployees();
		
		return list;
	}
	
	// ..........................................................get a single employee........................................
	@GetMapping("/employees/get/{Id}")
	public Optional<EmployeeModel> getEmployeeHandler(@PathVariable String Id) {
		
		Optional<EmployeeModel> empl= employeeServices.findEmployee(Integer.parseInt(Id));
		
		return empl;
	}
	
}
