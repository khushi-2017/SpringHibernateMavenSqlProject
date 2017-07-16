package com.khushi.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khushi.dao.EmployeeDao;
import com.khushi.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory session;

	@Override
	public void save(Employee employee) {
		session.getCurrentSession().save(employee);

	}

	@Override
	public void update(Employee employee) {
		session.getCurrentSession().update(employee);
	}

	@Override
	public void delete(int employeeId) {
		session.getCurrentSession().delete(getEmployee(employeeId));

	}

	@Override
	public Employee getEmployee(int employeeId) {

		return (Employee) session.getCurrentSession().get(Employee.class, employeeId);
	}

	@Override
	public List getAllEmployee() {

		return session.getCurrentSession().createQuery("from Employee").list();
	}

}
