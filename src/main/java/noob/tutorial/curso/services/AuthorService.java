package noob.tutorial.curso.services;

import noob.tutorial.curso.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
