package noob.tutorial.curso.repository;

import org.springframework.data.repository.CrudRepository;

import noob.tutorial.curso.domain.Author;

public interface AuthorRepository extends CrudRepository<Author,Long>{

}
