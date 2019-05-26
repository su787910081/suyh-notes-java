package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.pojo.Student;
import com.jt.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @RequestMapping("findStudent")
    public Student findStudent(Integer id) {
        Student student = service.queryStudent(id);
        return student;
    }
}