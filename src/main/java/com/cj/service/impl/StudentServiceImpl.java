package com.cj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cj.dao.IStudentDao;
import com.cj.entity.StudentEntity;
import com.cj.service.IStudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<IStudentDao, StudentEntity> implements IStudentService {

}
