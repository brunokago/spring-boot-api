package com.example.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
	@Autowired
    EmployeeRepository empRepository;  
	// CREATE 
	public Employee createEmployee(Employee emp) {
	    return empRepository.save(emp);
	}

	// READ
	public List<Employee> getEmployees() {
	    return empRepository.findAll();
	}
	public Optional<Employee> getEmployee(Long empId) {
		// TODO Auto-generated method stub
		return empRepository.findById(empId);
	}

	// DELETE
	public void deleteEmployee(Long empId) {
	    empRepository.deleteById(empId);
	}
	// UPDATE
	public Employee updateEmployee(Long empId, Employee employeeDetails) {
	        Employee emp = empRepository.findById(empId).get();
	        emp.setFirstName(employeeDetails.getFirstName());
	        emp.setLastName(employeeDetails.getLastName());
	        emp.setEmailId(employeeDetails.getEmail());
	        
	        return empRepository.save(emp);                                
	}

	
}
