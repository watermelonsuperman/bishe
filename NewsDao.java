package com.example.news.dao;

import com.example.news.entity.News;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface NewsDao {

    @Insert("insert into news (title,tutor,content) values (#{title},#{tutor},#{content}) ")
    void setNews(News news);

    @Select("SELECT * FROM news WHERE  title LIKE #{nam} OR content LIKE #{nam} OR tutor LIKE #{nam} ")
    List<News> getnews(String nam);

    @Select("select  *  from   news")
    List<News> getAllnews();

    @Delete("delete from news where id = #{id}")
    void newsdelete(int id);

}
