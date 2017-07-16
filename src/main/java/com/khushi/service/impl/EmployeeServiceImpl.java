/**
 * 
 */
package com.khushi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.khushi.dao.EmployeeDao;
import com.khushi.model.Employee;
import com.khushi.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Transactional
	public void save(Employee employee) {
		employeeDao.save(employee);

	}

	@Transactional
	public void update(Employee employee) {
		employeeDao.update(employee);

	}

	@Transactional
	public void delete(int employeeId) {
		employeeDao.delete(employeeId);


	}

	@Transactional
	public Employee getEmployee(int employeeId) {
		
		return employeeDao.getEmployee(employeeId);
	}

	@Transactional
	public List getAllEmployee() {
		
		return employeeDao.getAllEmployee();
	}

}
