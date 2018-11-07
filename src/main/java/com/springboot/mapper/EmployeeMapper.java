package com.springboot.mapper;

import com.springboot.bean.Employee;
import org.apache.ibatis.annotations.Options;

/**
 * mybatis XML配置文件
 */
//@Mapper
public interface EmployeeMapper {

    int insert(Employee employee);

    Employee selectById(Integer id);
}
