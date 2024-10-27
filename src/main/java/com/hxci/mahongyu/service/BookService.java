package com.hxci.mahongyu.service;

import com.hxci.mahongyu.pojo.Book;

import java.util.List;

public interface BookService {
    public List<Book> query();
    int del(Integer id);
}
