package etherinfotech.BookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import etherinfotech.BookStore.model.Book;


public interface BookRepository extends JpaRepository<Book, Long>{

}
