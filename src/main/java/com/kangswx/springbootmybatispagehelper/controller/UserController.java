package com.kangswx.springbootmybatispagehelper.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kangswx.springbootmybatispagehelper.entity.User;
import com.kangswx.springbootmybatispagehelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 分页查询User
     * @param pageNo
     * @param pageSize
     * @return
     */
    @GetMapping("find_page")
    public Object findPage(int pageNo, int pageSize){
        //设置分页信息
        PageHelper.startPage(pageNo, pageSize);
        List<User> users = userService.findAll();
        //生成分页信息对象
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return pageInfo;
    }

}
