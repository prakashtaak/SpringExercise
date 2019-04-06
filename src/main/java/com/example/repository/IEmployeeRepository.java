package com.example.repository;

import com.example.model.Employee;

import java.util.List;

public interface IEmployeeRepository {

    public int addEmployee(Employee employee);

    public Employee getEmployee(long id);

    public List<Employee> getAllEmployees();

}
