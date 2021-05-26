package com.nitish.employeeManagement.services;

import java.util.List;
import java.util.Optional;

import com.nitish.employeeManagement.models.EmployeeModel;

public interface EmployeeServices {
	
	public List<EmployeeModel> findEmployees() ;
	
	public EmployeeModel createEmployee(EmployeeModel emp);
	
	public Optional<EmployeeModel> findEmployee(int Id);
	
}
