package com.example.repositioryImpl;

import com.example.model.Employee;
import com.example.repository.IEmployeeRepository;

import java.util.*;

public class EmployeeRepositoryImpl implements IEmployeeRepository {


    static Map<Long, Employee> employees = new HashMap<>();


    @Override
    public int addEmployee(Employee employee) {
        if (employee == null)
            throw new RuntimeException("exception while adding employee | found empty object");

        employees.computeIfAbsent(employee.getId(), (key) -> employee);

        return 1;
    }

    @Override
    public Employee getEmployee(long id) {
        Employee emp = employees.get(id);
        if (emp == null)
            throw new RuntimeException("Cannot find given employee");
        return emp;
    }

    @Override
    public List<Employee> getAllEmployees() {
        if (employees.size() < 0)
            throw new RuntimeException("No employee in DB");
        return (List) employees.values();
    }
}
