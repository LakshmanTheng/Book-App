package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.entity.Book;
import com.bookapp.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookrepo;
	
	public void save(Book b) {
		bookrepo.save(b);
	}
	// fetch the data intable formate
	public List<Book> getAllBook(){
		return bookrepo.findAll();
		
	}

}
