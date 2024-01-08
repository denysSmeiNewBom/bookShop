package com.pet.bookshop.service;

import com.pet.bookshop.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
