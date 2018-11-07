package com.springboot.mapper;


import com.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * mybatis注解
 */
@Mapper
public interface DepartmentMapper{

    @Options(useGeneratedKeys = true, keyProperty = "id") //主键回填
    @Insert("insert into department(departmentName) values (#{departmentName})")
    int insert(Department department);

    @Select("select * from department where id = #{id}")
    Department selectById(Integer id);

    @Delete("delete from department where id = #{id}")
    int deleteById(Integer id);

    @Update("update department set departmentName = #{departmentName} where id = #{id}")
    int update(Department department);
}
