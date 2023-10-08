package project.mybookstore.repository;

import java.util.List;
import project.mybookstore.model.Book;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}
