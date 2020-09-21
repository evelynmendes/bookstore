package com.evelynmendes.bookstoremanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evelynmendes.bookstoremanager.dto.BookDTO;
import com.evelynmendes.bookstoremanager.dto.MessageResponseDTO;
import com.evelynmendes.bookstoremanager.entity.Book;
import com.evelynmendes.bookstoremanager.repository.BookRepository;

@Service
public class BookService {
	
	private BookRepository bookRepository;
	
	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	public MessageResponseDTO create(BookDTO bookDTO) {
		
		Book bookToSave = Book.builder()
				.name(bookDTO.getName())
				.pages(bookDTO.getPages())
				.chapters(bookDTO.getChapters())
				.author(bookDTO.getAuthor())
				.build();
		
		Book savedBook = bookRepository.save(savedBook);
		return MessageResponseDTO.builder()
				.message("Book created with ID " + savedBook.getId())
				.build();
	}

}
