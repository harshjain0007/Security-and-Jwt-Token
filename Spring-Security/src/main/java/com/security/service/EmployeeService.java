package com.security.service;

import com.security.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private List<Employee> empList=new ArrayList<>();

    public EmployeeService(){
        empList.add(new Employee(UUID.randomUUID().toString(),"harsh","harsh@gmail.com"));
        empList.add(new Employee(UUID.randomUUID().toString(),"jain","jain@gmail.com"));
        empList.add(new Employee(UUID.randomUUID().toString(),"raj","raj@gmail.com"));
        empList.add(new Employee(UUID.randomUUID().toString(),"singh","singh@gmail.com"));
    }
    public List<Employee> getEmployeeList(){
        return  empList;
    }
}
