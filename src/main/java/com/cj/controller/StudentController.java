package com.cj.controller;

import com.cj.entity.StudentEntity;
import com.cj.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {
//    @Autowired
//    StudentEntity studentEntity;

    @Autowired
    IStudentService studentService;

    @RequestMapping("seeStu")
    public String seeEntity(ModelMap map){
        List<StudentEntity> list = studentService.list();
        System.out.println(list);
        map.put("userlist",list);

        return "studentlist";
    }

}
