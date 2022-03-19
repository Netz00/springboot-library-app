package com.netz00.libraryapp.exception;

public class BookDoesNotExistsException extends RuntimeException{
    public BookDoesNotExistsException(String bookId){
        super("Book with ID " + bookId + " does not exists.");
    }
}