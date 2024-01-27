package com.MITProject.EMS_System.ServiceImpl;

import com.MITProject.EMS_System.Entity.Employee;
import com.MITProject.EMS_System.Repository.EmployeeRepository;
import com.MITProject.EMS_System.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return (List<Employee>) employeeRepository.findAll();
    }

    // Get Employee By Id
    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }

    // Update Employee
    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee employee1 = new Employee();
        employee1.setEmail(employee.getEmail());
        employee1.setNrc(employee.getNrc());
        employee1.setInterest(employee.getInterest());
        return employeeRepository.save(employee1);
    }

    // Delete Employee
    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
