package noob.tutorial.curso.bootstrap;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import noob.tutorial.curso.domain.Author;
import noob.tutorial.curso.domain.Book;
import noob.tutorial.curso.domain.Publisher;
import noob.tutorial.curso.repository.AuthorRepository;
import noob.tutorial.curso.repository.BookRepository;
import noob.tutorial.curso.repository.PublisherRepository;

@Component
public class BootstrapData  implements CommandLineRunner{

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,
            PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }



    @Override
    public void run(String... args){
        try{
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");
        
        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbm("1234");
        
        Publisher publisher = new Publisher();
        publisher.setName("My publisher");
        publisher.setAddress("123 main");

        publisherRepository.save(publisher);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(publisher);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        
        
        
        
        } catch(Exception e){
            e.getMessage();
        }

    }
}



