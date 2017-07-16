package com.khushi.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.khushi.model.Employee;
import com.khushi.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/index")
	public String setUpForm(Map<String, Object> map) {
		Employee employee = new Employee();
		map.put("employee", employee);
		map.put("employeeList", employeeService.getAllEmployee());
		return "employee";
	}

	@RequestMapping(value = "/employee.do", method = RequestMethod.POST)
	public String doActions(@ModelAttribute Employee employee, BindingResult result, @RequestParam String action,
			Map<String, Object> map) {
		Employee employeeResult = new Employee();
		switch (action.toLowerCase()) { // only in Java7 you can put String in
										// switch
		case "save":
			employeeService.save(employee);
			employeeResult = employee;
			break;
		case "update":
			employeeService.update(employee);
			employeeResult = employee;
			break;
		case "delete":
			employeeService.delete(employee.getEmployeeId());
			employeeResult = new Employee();
			break;
		case "search":
			Employee searchedEmployee = employeeService.getEmployee(employee.getEmployeeId());
			employeeResult = searchedEmployee != null ? searchedEmployee : new Employee();
			break;
		}
		map.put("employee", employeeResult);
		map.put("employeeList", employeeService.getAllEmployee());
		return "employee";
	}
}
