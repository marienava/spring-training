package com.cydeo.repository;

import com.cydeo.entity.Car;
import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
