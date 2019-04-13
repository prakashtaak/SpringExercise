package com.example.controllers;

import com.example.model.Employee;
import com.example.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    IEmployeeRepository employeeRepository;
    @Autowired
    EmployeeController(IEmployeeRepository repository){
        this.employeeRepository =repository;
    }


    @PostMapping("/addEmployee")
    // @RequestMapping(value = "/addEmployee",method = RequestMethod.POST,produces = "application/json")
    public Map<String, String> addEmployee(@Valid @RequestBody Employee employee) {
        Map<String, String> responseObject = new HashMap<>();
        Employee  result=null ;
        try {
            result = employeeRepository.saveAndFlush(employee);
        } finally {
            if (result == null) {
                responseObject.put("status", "failed");
            } else {
                responseObject.put("status", "success");
            }

        }
        return responseObject;

    }



    @GetMapping("/getEmployee/{key}")

    public Employee getEmployee(@PathVariable Long key){

        //return employeeRepository.getEmployee(key);

        return employeeRepository.getOne(key);
    }
}
