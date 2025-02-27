package noob.tutorial.curso.services;

import noob.tutorial.curso.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
