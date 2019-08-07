package com.kangswx.springbootmybatispagehelper.service.impl;

import com.kangswx.springbootmybatispagehelper.entity.User;
import com.kangswx.springbootmybatispagehelper.mapper.UserMapper;
import com.kangswx.springbootmybatispagehelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
