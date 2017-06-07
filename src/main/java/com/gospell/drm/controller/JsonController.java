package com.gospell.drm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gospell.drm.model.Employee;
import com.gospell.drm.service.EmployeeService;

/**
 * 控制器: 返回json格式的字符串
 */
@Controller
@RequestMapping("/json")
public class JsonController {
	
	@Autowired
	private EmployeeService employeeService;

	@ResponseBody
	@RequestMapping("/employee")
	public List<Employee> get() {
		List<Employee> employees= employeeService.findAllEmployees();
		return employees;
	}
}
