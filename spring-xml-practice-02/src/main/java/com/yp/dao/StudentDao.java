package com.yp.dao;

import com.yp.pojo.Student;

import java.util.List;

public interface StudentDao {

    /**
     * 查询全部学生数据
     * @return
     */
    List<Student> queryAll();
}