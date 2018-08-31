package pl.bekz.spreingframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.bekz.spreingframework.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
