package com.example.controllers;

import com.example.model.Employee;
import com.example.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    IEmployeeRepository employeeRepository;


    @PostMapping("/addEmployee")
    // @RequestMapping(value = "/addEmployee",method = RequestMethod.POST,produces = "application/json")
    public Map<String, String> addEmployee(Employee employee) {
        Map<String, String> responseObject = new HashMap<>();
        int result = 0;
        try {
            result = employeeRepository.addEmployee(employee);
        } finally {
            if (result == 0) {
                responseObject.put("status", "failed");
            } else {
                responseObject.put("status", "success");
            }

        }
        return responseObject;

    }

    @GetMapping("/getEmployee")
    public Employee getEmployee(){

        return new Employee(123l,"prakash","baner",23312.12);
    }
}
