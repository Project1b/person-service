package pe.com.bank.person.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import pe.com.bank.person.entity.Person;

@Repository
public interface PersonRepository extends ReactiveMongoRepository<Person,String> {
	
}
