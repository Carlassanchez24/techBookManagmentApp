package org.TBMA;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class BookManager {
    private BookRepository bookRepository = new MySQLBookRepository();



    public void addBook(String isbn, String title, String author) throws SQLException {
        Optional<Book> optionalBook = bookRepository.findByIsbn(isbn);

        if (optionalBook.isPresent()) {
            throw new IllegalArgumentException("Este libro ya existe.");
        }

        Book newBook = new Book(isbn, title, author);
        bookRepository.save(newBook);
    }

    public void deleteByIsbn(String isbnToDelete) throws SQLException {
        bookRepository.deleteByIsbn(isbnToDelete);
    }

    public List<Book> getAllBooks() throws SQLException {
        return bookRepository.findAll();
    }
}

