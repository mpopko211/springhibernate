package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sda.repository.PersonRepository;


public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        PersonRepository personRepository = (PersonRepository) context.getBean("personRepository");

        createdPerson(personRepository, "Olek", "Kowalski");

        createdPerson(personRepository, "Alek", "Waszczuk");

        Iterable<Person> all = personRepository.findAll();
        for (Person persons:all){
            System.out.println(persons);
        }
    }

    private static void createdPerson(PersonRepository personRepository, String firstName, String lastName) {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        personRepository.save(person);
    }
}

