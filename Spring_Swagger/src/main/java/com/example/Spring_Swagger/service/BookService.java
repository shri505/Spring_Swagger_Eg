package com.example.Spring_Swagger.service;

import com.example.Spring_Swagger.dao.BookRepository;
import com.example.Spring_Swagger.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public String saveBook(Book book) {
        repository.save(book);
        return "Book saved with id " + book.getBookId();
    }

    public Optional<Book> getBook(int bookId) {
        return repository.findById(bookId); // Use findById instead of findOne
    }

    public List<Book> removeBook(int bookId) {
        repository.deleteById(bookId); // Use deleteById instead of delete
        return repository.findAll();
    }
}
