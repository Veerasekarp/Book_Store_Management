package etherinfotech.BookStore.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import etherinfotech.BookStore.model.Book;
import etherinfotech.BookStore.repository.BookRepository;
import etherinfotech.BookStore.service.BookService;


@Service
public class BookServiceImpl implements BookService{
	
	private BookRepository bRepo;
	
	public BookServiceImpl(BookRepository bRepo) {
		super();
		this.bRepo = bRepo;
	}

	@Override
	public List<Book> getAllBooks() {
		return bRepo.findAll();
	}

	@Override
	public Book saveBook(Book book) {
		return bRepo.save(book);
	}

	@Override
	public Book getBookById(Long id) {
		return bRepo.findById(id).get();
	}

}
