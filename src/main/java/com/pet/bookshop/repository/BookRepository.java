package com.pet.bookshop.repository;

import com.pet.bookshop.model.Book;
import java.util.List;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}
