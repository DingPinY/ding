package com.xttc.dao;

import com.xttc.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserDao {

    @Select("select * from user where username = #{username} and password = #{password}")
    public User login(User user);
}
