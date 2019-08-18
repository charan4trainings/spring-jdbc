package org.trainings.charan.springjdbch2.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.trainings.charan.springjdbch2.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/all")
	public List<Employee> getAllEmployees() {
		return null;
	}
	
}
