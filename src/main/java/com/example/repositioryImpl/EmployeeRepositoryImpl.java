package com.example.repositioryImpl;

import com.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class EmployeeRepositoryImpl {


    //static Map<Long, Employee> employees = new HashMap<>();
    @Autowired
    EntityManager entityManager;


    public int addEmployee(Employee employee) {
        if (employee == null)
            throw new RuntimeException("exception while adding employee | found empty object");
        entityManager.persist(employee);
        //Employee employee1 = employees.computeIfAbsent(employee.getId(), (key) -> employee);
        return 1;
    }


    public Employee getEmployee(long id) {
       Query getQuery = entityManager.createQuery("select * from Employee where id=:id");
        Employee emp = (Employee)getQuery.getSingleResult();

        if (emp == null)
            throw new RuntimeException("Cannot find given employee");
        return emp;
    }


   /* public List<Employee> getAllEmployees() {

        return (List) entityManager.();
    }*/
}
