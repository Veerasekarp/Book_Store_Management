package etherinfotech.BookStore.service;

import java.util.List;

import etherinfotech.BookStore.model.Book;

public interface BookService {
	
	List<Book> getAllBooks();
	Book saveBook(Book book);
	Book getBookById(Long id);
	
}
