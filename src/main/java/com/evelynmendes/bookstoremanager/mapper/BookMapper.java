package com.evelynmendes.bookstoremanager.mapper;



import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.evelynmendes.bookstoremanager.dto.BookDTO;
import com.evelynmendes.bookstoremanager.entity.Book;

@Mapper
public interface BookMapper {
	
	BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

	Book toModel(BookDTO bookDTO);
	
	BookDTO toDTO(Book book);

}
