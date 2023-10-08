package project.mybookstore;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import project.mybookstore.model.Book;
import project.mybookstore.service.BookService;

@SpringBootApplication
public class MyBookStoreApplication {
    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(MyBookStoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Book book = new Book();
            book.setTitle("The Adventures of Tom Sawyer");
            book.setAuthor("Mark Tven");
            book.setIsbn("111-2222");
            book.setPrice(BigDecimal.valueOf(250));
            book.setDescription("Interesting book about adventures");
            book.setCoverImage("123");

            bookService.save(book);
            System.out.println(bookService.findAll());
        };
    }

}
