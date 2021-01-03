package repository;

import person.Person;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class InMemoryRepository implements PersonRepository {
    public final Set<Person> persons = new HashSet<Person>();

    public void save(Person person) {
        // TODO
        // method should add given person to `persons` collection
        persons.add(person);
    }

    public List<Person>  getAllPersons() {
        // TODO
        // method should return all existing persons
        return persons.stream().collect(Collectors.toList());
        //return Collections.emptyList();
    }
}
