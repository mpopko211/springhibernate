package pl.sda.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.Person;


@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {

}


