package com.example.Spring_Swagger.dao;

import com.example.Spring_Swagger.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
