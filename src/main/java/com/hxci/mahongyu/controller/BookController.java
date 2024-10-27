package com.hxci.mahongyu.controller;

import com.hxci.mahongyu.pojo.Book;
import com.hxci.mahongyu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("bk")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("index")
    public String index() {
        return "index";
    }
    @RequestMapping("query")
    @ResponseBody
    public List query() {
        List<Book> book = bookService.query();
        return book;
    }
    @RequestMapping("list")
    public String list() {
        return "list";
    }
    @RequestMapping("del")
    public String del(Integer id) {
        int a = bookService.del(id);
        return a+"";
    }


}
