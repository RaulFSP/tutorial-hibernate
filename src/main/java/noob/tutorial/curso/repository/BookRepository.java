package noob.tutorial.curso.repository;

import org.springframework.data.repository.CrudRepository;

import noob.tutorial.curso.domain.Book;

public interface BookRepository extends CrudRepository<Book,Long>{

}
