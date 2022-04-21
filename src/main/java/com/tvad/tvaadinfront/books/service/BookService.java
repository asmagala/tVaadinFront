package com.tvad.tvaadinfront.books.service;

import com.tvad.tvaadinfront.books.domain.Book;

import java.util.HashSet;
import java.util.Set;

public class BookService {

    private Set books;
    private static BookService bookService;

    private BookService() {
        this.books = exampleData();
    }

    public static BookService getInstance() {
        if (bookService == null) {
            bookService = new BookService();
        }
        return bookService;
    }

    public Set getBooks() {
        return new HashSet<>(books);
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    private Set exampleData() {
        Set books = new HashSet<>();
        books.add(new Book("Cracking the Coding Interview: 189 Programming Questions and Solutions", "Gayle Laakmann McDowell",  "2015", "IT"));
        books.add(new Book("Introduction to Algorithms", "The MIT Press", "2009", "IT"));
        books.add(new Book("Introduction to the Theory of Computation", "Michael Sipser", "2012", "IT"));
        books.add(new Book("Operating System Concepts", "Silberschatz, Galvin, Gagne", "2012", "IT"));
        books.add(new Book("The Silent Patient", "Alex Michaelides", "2019", "Thriller"));
        books.add(new Book("The Handmaid's Tale", "Margaret Atwood", "2019", "Classic"));
        books.add(new Book("Watch Us Rise", "Renée Watson,  Ellen Hagan", "2019", "Poetry"));
        return books;
    }
}