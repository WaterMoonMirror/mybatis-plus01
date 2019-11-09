package com.wondersgroup.mybatisplus01.mapper;

import com.wondersgroup.mybatisplus01.MybatisPlus01ApplicationTests;
import com.wondersgroup.mybatisplus01.javabeans.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeDaoTest extends MybatisPlus01ApplicationTests {

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void setEmployeeDao(){

        int insert = employeeDao.insert(Employee.builder().build());
        System.out.println("insert:"+insert);


    }
}