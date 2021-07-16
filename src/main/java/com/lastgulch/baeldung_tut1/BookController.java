package com.lastgulch.baeldung_tut1;

import com.lastgulch.baeldung_tut1.exception.BookNotFoundException;
import com.lastgulch.baeldung_tut1.model.Book;
import com.lastgulch.baeldung_tut1.persistence.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping()
    public Iterable findAll() {
        return bookRepository.findAll();
    }

    @GetMapping("/title/{bookTitle}")
    public List findByTitle(@PathVariable String bookTitle){
        return bookRepository.findByTitle(bookTitle);
    }

    @GetMapping("/{id}")
    public Book findOne(@PathVariable Long id) {
        return bookRepository.findById(id).orElseThrow(BookNotFoundException:: new);
    }
}
