package com.rays.springproject;


import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.springproject.services.BookService;


@RestController
public class TestCtl {
	
	@Autowired
	private BookService bookService;

	@RequestMapping("/test")

	public String handleTest() {
		int a=9;
		int b=7;
		return "this is project using Sts / sum of a and b="+(a+b);
		
	}
	
    @RequestMapping("/books")
   
    public List getBooks(){
     
		return (List) this.bookService.getAllBooks() ;
    }

	
}
