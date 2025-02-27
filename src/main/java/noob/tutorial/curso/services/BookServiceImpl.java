package noob.tutorial.curso.services;

import org.springframework.stereotype.Service;

import noob.tutorial.curso.domain.Book;
import noob.tutorial.curso.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository repository;
    
    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Book> findAll() {
        return repository.findAll();

    }

}
