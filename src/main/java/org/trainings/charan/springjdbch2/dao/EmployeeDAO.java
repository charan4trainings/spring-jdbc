package org.trainings.charan.springjdbch2.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.trainings.charan.springjdbch2.model.Employee;

@Repository
public class EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Employee> getAllEmployees() {
		return null;
	}
	
}
