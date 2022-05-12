package com.trebnikau.dao;

import com.trebnikau.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> readAllEmployees();

    Employee readEmployee(int employeeId);

    void saveEmployee(Employee employee);

    void deleteEmployee(int employeeId);
}
