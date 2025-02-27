package noob.tutorial.curso.services;

import org.springframework.stereotype.Service;

import noob.tutorial.curso.domain.Author;
import noob.tutorial.curso.repository.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService{

    private final AuthorRepository repository;
    
    public AuthorServiceImpl(AuthorRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Author> findAll() {
        return repository.findAll();    
    }

}
