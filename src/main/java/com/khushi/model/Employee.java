package com.khushi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int employeeId;
	@Column
	private String employeeName;
	@Column
	private String employeeLastName;
	@Column
	private int employeePhone;

	public Employee() {

	}

	public Employee(String employeeName, String employeeLastName, int employeePhone) {
		super();
		this.employeeName = employeeName;
		this.employeeLastName = employeeLastName;
		this.employeePhone = employeePhone;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public int getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(int employeePhone) {
		this.employeePhone = employeePhone;
	}

}
