package com.kangswx.springbootmybatispagehelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages ="com.kangswx.springbootmybatispagehelper.mapper")
@SpringBootApplication
public class SpringbootMybatisPagehelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisPagehelperApplication.class, args);
    }

}
