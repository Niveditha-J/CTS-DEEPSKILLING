// LibraryManagement/src/main/java/com/library/service/BookService.java
package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        System.out.println("Fetching books from repository...");
        bookRepository.getAllBooks();
    }
}
