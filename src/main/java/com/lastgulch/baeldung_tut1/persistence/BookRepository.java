package com.lastgulch.baeldung_tut1.persistence;

import com.lastgulch.baeldung_tut1.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
