package com.example.Spring_Swagger.controller;

import com.example.Spring_Swagger.model.Book;
import com.example.Spring_Swagger.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping("/save")
    public String saveBook(@RequestBody Book book) {
        return service.saveBook(book);
    }

    @GetMapping("/searchBook/{bookId}")
    public Optional<Book> getBook(@PathVariable int bookId) {
        return service.getBook(bookId);
    }

    @DeleteMapping("/deleteBook/{bookId}")
    public List<Book> deleteBook(@PathVariable int bookId) {
        return service.removeBook(bookId);
    }
}
//http://localhost:8080/swagger-ui/index.html