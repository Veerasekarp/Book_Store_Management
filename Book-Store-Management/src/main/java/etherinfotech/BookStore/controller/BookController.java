package etherinfotech.BookStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import etherinfotech.BookStore.model.Book;
import etherinfotech.BookStore.service.impl.BookServiceImpl;

@Controller
public class BookController {
	
	private BookServiceImpl serviceImpl;
	
	public BookController(BookServiceImpl serviceImpl) {
		super();
		this.serviceImpl = serviceImpl;
	}

	@GetMapping("/")
	public String Homepage() {
		return "home";
	}
	
	@GetMapping("/CurrentStoreItems")
	public String BookStocks(Model model) {
		model.addAttribute("book", serviceImpl.getAllBooks());
		return "availableBooks";
	}
	
	
	@GetMapping("/RegisterBook")
	public String NewBookRegister() {
		return "BookRegister";
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book b){
		serviceImpl.saveBook(b);
		return "redirect:/CurrentStoreItems";
	}
	
	@GetMapping("/editBook/{id}")
	public String EditBook(@PathVariable("id") Long id, Model model) {
		Book b = serviceImpl.getBookById(id);
		model.addAttribute("book", b);
		return "BookEdit";
	}
}
