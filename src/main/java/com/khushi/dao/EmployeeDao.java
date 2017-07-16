package com.khushi.dao;

import java.util.List;

import com.khushi.model.Employee;

public interface EmployeeDao {
	public void save(Employee employee);

	public void update(Employee employee);

	public void delete(int employeeId);

	public Employee getEmployee(int employeeId);

	public List getAllEmployee();

}
