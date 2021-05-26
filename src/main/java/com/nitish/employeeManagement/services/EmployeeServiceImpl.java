package com.nitish.employeeManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitish.employeeManagement.dao.EmployeeModelDao;
import com.nitish.employeeManagement.models.EmployeeModel;


@Service
public class EmployeeServiceImpl implements EmployeeServices {

	@Autowired
	private EmployeeModelDao employeeDao;
	
	
	public EmployeeModel createEmployee(EmployeeModel emp) {
		System.out.println("inside createUser service");
		return this.employeeDao.save(emp);
	}
	
	
	public List<EmployeeModel> findEmployees() {
		System.out.println(" inside findEmployees services ");
		
		List<EmployeeModel> list= this.employeeDao.findAll();
		
//		if(list.size()<=0) {
//			return EmployeeModel.status(HttpStatus.NOT_FOUND).build();
//		}
		return list;
	}
	
	
	
	public Optional<EmployeeModel> findEmployee(int Id) {
		System.out.println(" inside findSingleEmployee services ");
		
		Optional<EmployeeModel> empl= this.employeeDao.findById(Id);
		
		return empl;
	}

}
