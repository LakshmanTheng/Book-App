package com.bookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bookapp.entity.Book;
import com.bookapp.repository.BookRepository;
import com.bookapp.service.BookService;


@Controller
public class BookController {
	
	@Autowired
	private BookService service;
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/book_register")
	public String bookRegister() {
		return "bookRegister";
	}
	
	@GetMapping("/avilable_books")
	public ModelAndView getAllBooks() {
		List<Book> list= service.getAllBook();		// booklist page
//		ModelAndView m= new ModelAndView();
//		m.setViewName("bookList");
//		m.addObject("book", list);
		return new ModelAndView("bookList", "book", list);
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book b) {
		service.save(b);
		return "redirect:/avilable_books";
	}
}
