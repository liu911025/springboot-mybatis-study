package com.springboot.controller;

import com.springboot.bean.Employee;
import com.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by liujiatai on 2018/9/1.
 */
@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;

    @PostMapping("save")
    public Employee insert(@RequestBody Employee employee) {
        employeeMapper.insert(employee);
        return employee;
    }

    @GetMapping("select/{id}")
    public Employee selectById(@PathVariable("id") Integer id){
        return employeeMapper.selectById(id);
    }
}
