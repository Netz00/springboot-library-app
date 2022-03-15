package com.netz00.libraryapp.service;

import com.netz00.libraryapp.domain.Author;
import com.netz00.libraryapp.domain.Book;

import java.util.List;

public interface BookService {

    public List<Book> findAll();

    public Book findById(String id);

    public Book addNewBook(Book book);

    public Book deleteBook(String id);

    public Book patchBook(String id, Book author);


    /**
     *  Find all books of certain author
     */
    public List<Book> findAll(Author author);

}