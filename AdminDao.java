package com.example.news.dao;

import com.example.news.entity.Admin;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
@Repository
public interface AdminDao {


    @Delete("delete from user where id = #{id}")
    void delete(int id);

    @Select("select  *  from admin  where adminname = #{adminname} and adminpassword = #{adminpassword} ")
    List<Admin> login(Admin admin);
}

