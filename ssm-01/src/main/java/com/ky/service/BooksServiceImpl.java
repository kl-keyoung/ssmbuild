package com.ky.service;

import com.ky.mapper.BooksMapper;
import com.ky.pojo.Books;

import java.util.List;

public class BooksServiceImpl implements BooksService{
    //service调dao层，组合dao
    private BooksMapper booksMapper;
    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    @Override
    public int addBooks(Books books) {
        return booksMapper.addBooks(books);
    }

    @Override
    public int deleteBooks(int id) {
        return booksMapper.deleteBooks(id);
    }

    @Override
    public int updateBooks(Books books) {
        return booksMapper.updateBooks(books);
    }

    @Override
    public Books query(int id) {
        return booksMapper.query(id);
    }

    @Override
    public List<Books> queryAll() {
        return booksMapper.queryAll();
    }

    @Override
    public Books queryByName(String bookName) {
        return booksMapper.queryByName(bookName);
    }
}
