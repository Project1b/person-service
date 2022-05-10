package pe.com.bank.person.service;

import pe.com.bank.person.entity.Customer;
import pe.com.bank.person.entity.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonService {
	
	 public Mono<Person> addPerson(Person person);
	 public Flux<Person> getPersons();
	 public Mono<Person> getPersonById(String id);
	 public Mono<Person> updatePerson(Person person, String id);
	 public Mono<Void> deletePersonById(String id);
	 public Mono <Customer> getCustomerByPersonId(String id);

}
