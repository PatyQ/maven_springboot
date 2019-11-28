package com.qf.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cj")
@MapperScan("com.cj.dao")
public class MavenSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MavenSpringBootApplication.class, args);
    }

}
