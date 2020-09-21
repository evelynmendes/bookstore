package com.evelynmendes.bookstoremanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evelynmendes.bookstoremanager.dto.BookDTO;
import com.evelynmendes.bookstoremanager.dto.MessageResponseDTO;
import com.evelynmendes.bookstoremanager.service.BookService;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

	private BookService bookService;
	
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@PostMapping
	public MessageResponseDTO create(@RequestBody BookDTO livroDTO) {
		return bookService.create(livroDTO);
	}
	
}
