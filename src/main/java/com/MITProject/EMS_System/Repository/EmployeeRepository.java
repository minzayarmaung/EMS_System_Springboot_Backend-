package com.MITProject.EMS_System.Repository;

import com.MITProject.EMS_System.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee , Long> {

}
