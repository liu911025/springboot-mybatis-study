package com.springboot.controller;

import com.springboot.mapper.DepartmentMapper;
import com.springboot.bean.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by liujiatai on 2018/9/1.
 */

@RestController
@RequestMapping("dept")
public class DepartmentController {

    @Autowired
    DepartmentMapper departmentMapper;

    @PostMapping("save")
    public Department insert(@RequestBody Department department) {
        departmentMapper.insert(department);
        return department;
    }

    @GetMapping("select/{id}")
    public Department selectById(@PathVariable("id") Integer id) {
        return departmentMapper.selectById(id);
    }

    @PutMapping("save")
    public int update(@RequestBody Department department) {
        return departmentMapper.update(department);
    }

    @GetMapping("delete/{id}")
    public int deleteById(@PathVariable("id") Integer id) {
        return departmentMapper.deleteById(id);
    }
}
