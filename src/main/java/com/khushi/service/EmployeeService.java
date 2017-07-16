package com.khushi.service;

import java.util.List;

import com.khushi.model.Employee;

public interface EmployeeService {

	
	public void save(Employee employee);

	public void update(Employee employee);

	public void delete(int employeeId);

	public Employee getEmployee(int employeeId);

	public List getAllEmployee();
}