package com.ky.controller;

import com.ky.pojo.Books;
import com.ky.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BooksService booksService;

    //查询所有书籍，返回到一个书记展示页面
    @RequestMapping("/allBook")
    public String AllList(Model model){
        List<Books> list = booksService.queryAll();
        model.addAttribute("list",list);
        return "allBook";
    }

    //添加跳转
    //#{bookName},#{bookCounts},#{bookCounts}
    @RequestMapping("/toaddPage")
    public String toaddBook(){

        return "addBook";
    }
    //添加书籍
    @RequestMapping("/addBook")
    public String addBook(Books books){
        booksService.addBooks(books);
        return  "redirect:/book/allBook";
    }


    //删除书籍
    //RestFull风格
    @RequestMapping("/delBook/{bookID}")
    public String delBook(@PathVariable("bookID") int bookID){
        booksService.deleteBooks(bookID);
        return "redirect:/book/allBook";
    }

    //跳转到更新页面
    @RequestMapping("/toupdatePage/{bookID}")
    public String Toupdate(@PathVariable("bookID") int bookID,Model model){
        Books books = booksService.query(bookID);
        model.addAttribute("QIdBook",books);
        return "updateBook";
    }
    //更新书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        booksService.updateBooks(books);
        return "redirect:/book/allBook";
    }
    //根据书名查询
    @RequestMapping("/queryByName")
    public String queryByName(String queryBookName,Model model){
        Books books = booksService.queryByName(queryBookName);
        List<Books> list = new ArrayList<>();
        list.add(books);
        model.addAttribute("list",list);
        return "allBook";
    }

}
