package com.kangswx.springbootmybatispagehelper.service.impl;

import com.github.pagehelper.PageHelper;
import com.kangswx.springbootmybatispagehelper.entity.User;
import com.kangswx.springbootmybatispagehelper.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void findAll() {
        int pageNum = 3;
        int pageSize = 3;
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userService.findAll();
        System.out.println("size: " + users.size());
        for (User user : users){
            System.out.println(user);
        }
    }
}