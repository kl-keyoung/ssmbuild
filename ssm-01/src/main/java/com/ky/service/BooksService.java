package com.ky.service;

import com.ky.pojo.Books;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksService {
    //增加一本书
    int addBooks(Books books);
    //删除一本书
    int deleteBooks(@Param("bookID") int id);
    //更新一本书
    int updateBooks(Books books);
    //查询一本书
    Books query(int id);
    //查询所有书
    List<Books> queryAll();
    //搜索框
    Books queryByName(@Param("bookName") String bookName);
}
