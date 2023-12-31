package com.yp.service.impl;

import com.yp.dao.StudentDao;
import com.yp.pojo.Student;
import com.yp.service.StudentService;

import java.util.List;

public class StudentServiceImpl  implements StudentService {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    /**
     * 查询全部学员业务
     * @return
     */
    @Override
    public List<Student> findAll() {

        List<Student> studentList =  studentDao.queryAll();

        return studentList;
    }
}