package com.hxci.mahongyu.service.impl;

import com.hxci.mahongyu.dao.BookDao;
import com.hxci.mahongyu.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hxci.mahongyu.service.BookService;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookDao bookDao;

    @Override
    public List<Book> query() {
        return bookDao.query();
    }

    @Override
    public int del(Integer id) {
        return bookDao.del(id);
    }
}
