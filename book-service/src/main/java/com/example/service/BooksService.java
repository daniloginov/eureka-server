package com.example.service;

import com.example.repository.BooksRepository;
import com.example.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {
    @Autowired
    private BooksRepository booksRepository;

    public List<Book> findAllBooks() {
        return booksRepository.findAll();
    }
}