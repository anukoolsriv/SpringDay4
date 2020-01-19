package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.model.Employee;
import com.lti.service.EmployeeService;

@Controller
public class WebAppController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String homePage() {
		return "index";
	}
	
	@RequestMapping(path="/addEmployee.view", method=RequestMethod.GET)
	public String addEmployeeView() {
		return "addEmployee";
	}
	
	@RequestMapping(path="/addEmployee.do", method=RequestMethod.POST)
	public String addEmployee(Employee employee){
		boolean result = service.addEmployee(employee);
		
		if(result) {
			return "redirect:findAllEmployees.do";
		}
		else {
			return "error";
		}
	}
		
	@RequestMapping(path="findAllEmployees.do")
	public String findAllEmployees(Model model) {
		List<Employee> employees = service.getAllEmployees();
		model.addAttribute(employees);
		return "viewAllEmployees";
	}
}
