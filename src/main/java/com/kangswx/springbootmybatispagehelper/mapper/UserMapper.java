package com.kangswx.springbootmybatispagehelper.mapper;

import com.kangswx.springbootmybatispagehelper.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    List<User> findAll();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}