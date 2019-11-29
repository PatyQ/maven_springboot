package com.cj.controller;

import com.cj.entity.StudentEntity;
import com.cj.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {
//    @Autowired
//    StudentEntity studentEntity;
    @Autowired
    IStudentService studentService;

    //查看学生列表
    @RequestMapping("seeStu")
    public String seeEntity(ModelMap map){
        List<StudentEntity> list = studentService.list();
        System.out.println(list);
        map.put("userlist",list);
        return "studentlist";
    }

    @RequestMapping("selUserById/{id}")
    private String selUserById (@PathVariable Integer id, ModelMap map){
        StudentEntity studentEntity = studentService.getById(id);
        System.out.println(studentEntity);
        map.put("stu",studentEntity);
        return "updateStu";
    }

    @RequestMapping("updUser")
    private String updUserById (StudentEntity studentEntity, ModelMap map){
        System.out.println(studentEntity);

        map.put("stu",studentEntity);
        return "updateStu";
    }

}
