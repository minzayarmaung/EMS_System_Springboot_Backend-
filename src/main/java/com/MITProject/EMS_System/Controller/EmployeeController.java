package com.MITProject.EMS_System.Controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.MITProject.EMS_System.Entity.Employee;
import com.MITProject.EMS_System.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public String addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return "Added Successfully !";
    }

    @GetMapping("/all_employees")
    public List<Employee> getEmployees(){
        System.out.println("Users : ");
        return employeeService.getAllEmployees();
    }

    @PutMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") long id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/update/{id}")
    public String updateEmployee(@PathVariable("id") long id , @RequestBody Employee employee){
        employeeService.updateEmployee(id , employee);
        return "Employee Updated Successfully......";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") long id){
        employeeService.deleteEmployee(id);
        return "Employee Deleted Successfully....";
    }

}
