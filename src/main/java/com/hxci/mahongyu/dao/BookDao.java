package com.hxci.mahongyu.dao;

import com.hxci.mahongyu.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookDao {
    public List<Book> query();
    int del(Integer id);
}
