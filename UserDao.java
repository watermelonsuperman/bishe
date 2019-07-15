package com.example.news.dao;


import com.example.news.entity.News;
import com.example.news.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {

    @Select("select  *  from   user")
    List<User> getAllUser();


    @Insert("insert into user (username,userpassword) values (#{username},#{userpassword}) ")
    void register(User user);

    @Select("select  *  from user  where username = #{username} and userpassword = #{userpassword} ")
    List<User> login(User user);
}
