package mate.academy.repository;

import java.util.List;
import mate.academy.model.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}
