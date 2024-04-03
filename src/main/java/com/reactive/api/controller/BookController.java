package com.reactive.api.controller;

import com.reactive.api.Entities.Book;
import com.reactive.api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    //create

    @PostMapping
    public Mono<Book> create(@RequestBody Book book){
        return bookService.create(book);

    }
    // get all books

    @GetMapping
    public Flux<Book> getAll(){
        return bookService.getAll();
    }

}
