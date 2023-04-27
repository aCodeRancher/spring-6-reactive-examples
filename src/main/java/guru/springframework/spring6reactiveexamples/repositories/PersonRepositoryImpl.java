package guru.springframework.spring6reactiveexamples.repositories;

import guru.springframework.spring6reactiveexamples.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * Created by jt, Spring Framework Guru.
 */
public class PersonRepositoryImpl implements PersonRepository {

    Person michael = Person.builder().id(1).firstName("Michael").lastName("Weston").build();
    Person fiona = Person.builder().id(2).firstName("Fiona").lastName("Glenanne").build();
    Person sam = Person.builder().id(3).firstName("Sam").lastName("Axe").build();
    Person jesse = Person.builder().id(4).firstName("Jesse").lastName("Porter").build();

    List<Person> personList = List.of(michael, fiona, sam, jesse);

    @Override
    public Mono<Person> getById(Integer id) {
        Mono<Person> person = getById(id);
         return person;
    }

    @Override
    public Flux<Person> findAll() {
         Flux<Person> people = Flux.fromIterable(personList);
        return people;
    }
}
