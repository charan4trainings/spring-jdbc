package org.trainings.charan.springjdbch2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trainings.charan.springjdbch2.dao.EmployeeDAO;
import org.trainings.charan.springjdbch2.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

}
