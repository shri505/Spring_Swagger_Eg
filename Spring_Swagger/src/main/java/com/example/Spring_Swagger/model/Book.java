package com.example.Spring_Swagger.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Book implements Serializable {


    @Serial
    private static final long serialVersionUID= -1670893016517855654L;
    @Id
    @GeneratedValue
    private int bookId;
    private String bookName;
    private double price;

    public int getBookId() {
        return bookId;
    }
}
