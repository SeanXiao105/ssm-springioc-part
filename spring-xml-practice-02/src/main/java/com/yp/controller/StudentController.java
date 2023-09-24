package com.yp.controller;

import com.yp.pojo.Student;
import com.yp.service.StudentService;

import java.util.List;

public class StudentController {

    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void  findAll(){
        List<Student> studentList =  studentService.findAll();
        System.out.println("studentList = " + studentList);
    }
}