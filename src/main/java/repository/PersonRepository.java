package repository;

import java.util.List;
import person.Person;

public interface PersonRepository {
    void save(Person person);
    List<Person> getAllPersons();
}
