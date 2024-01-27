package com.MITProject.EMS_System.Service;

import com.MITProject.EMS_System.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    // Add Employee
    public Employee addEmployee(Employee employee);

    // Get All Employees
    public List<Employee> getAllEmployees();

    // Get By Id
    public Employee getEmployeeById(Long id);

    // Update Employee
    public Employee updateEmployee(Long id , Employee employee);

    // Delete Employee
    public void deleteEmployee(Long id);
}
