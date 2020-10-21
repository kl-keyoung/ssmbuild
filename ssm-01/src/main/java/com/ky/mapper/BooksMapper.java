package com.ky.mapper;

import com.ky.pojo.Books;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksMapper {
    //增加一本书
    int addBooks(Books books);

    //删除一本书
    int deleteBooks(int id);
    //更新一本书
    int updateBooks(Books books);
    //查询一本书
    Books query(int id);
    //查询所有书
    List<Books> queryAll();
    //搜索框查询
    Books queryByName(String bookName);
}
