package project.mybookstore.service;

import java.util.List;
import project.mybookstore.model.Book;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
