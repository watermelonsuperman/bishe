package com.example.news.dao;

import com.example.news.entity.News;
import com.example.news.entity.Share;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
@Repository
public interface ShareDao {

    @Select("SELECT * FROM share WHERE  name LIKE #{nam} ")
    List<Share> getshare(String nam);

    @Select("select  *  from   share")
    List<Share> getAllshare();
}
