package pl.bekz.spreingframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.bekz.spreingframework.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
