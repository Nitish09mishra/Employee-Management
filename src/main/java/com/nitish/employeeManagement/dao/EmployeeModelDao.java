package com.nitish.employeeManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.nitish.employeeManagement.models.EmployeeModel;


public interface EmployeeModelDao extends JpaRepository<EmployeeModel, Integer> {
//	public EmployeeModel findById(EmployeeModel emp, int Id);
}
