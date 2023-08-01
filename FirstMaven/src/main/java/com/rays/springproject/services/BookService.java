package com.rays.springproject.services;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BookService {

    private List<Book> list = new ArrayList<>();

    static{
        list.add(new Book(12,"gyg bbb uygy","fyugu"));
     list.add(new Book(14,"gygcnjk bnjd uygy","fyugu"));
      list.add(new Book(16,"cnnmd cncd uygy","fyugu"));
    }
    public List<Book> getAllBooks(){
        return list;
    }

    public Book getBookById(int id){

        Book book=null;
        list.stream().filter(e->e.getId()==id).findFirst().get();
    return book;
    }
}
