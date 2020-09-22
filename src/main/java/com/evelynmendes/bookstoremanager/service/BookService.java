package com.evelynmendes.bookstoremanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evelynmendes.bookstoremanager.dto.BookDTO;
import com.evelynmendes.bookstoremanager.dto.MessageResponseDTO;
import com.evelynmendes.bookstoremanager.entity.Book;
import com.evelynmendes.bookstoremanager.mapper.BookMapper;
import com.evelynmendes.bookstoremanager.repository.BookRepository;

@Service
public class BookService {
	
	private BookRepository bookRepository;
	
	private final BookMapper bookMapper = BookMapper.INSTANCE;
	
	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public MessageResponseDTO create(BookDTO bookDTO) {
		
		Book bookToSave = bookMapper.toModel(bookDTO);
		
		Book savedBook = bookRepository.save(bookToSave);
		return MessageResponseDTO.builder()
				.message("Book created with ID " + savedBook.getId())
				.build();
	}

}
