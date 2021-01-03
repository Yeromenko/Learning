package statistics;

import person.Person;
import repository.PersonRepository;

import java.util.Collections;
import java.util.List;

public class PersonStatistics {
    private final PersonRepository personRepository;

    public PersonStatistics(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public int getPersonsCount() {
        // TODO
        int count = personRepository.getAllPersons().size();
        return count;
    }

    public Person getTheOldestPerson() {
        // TODO
        return null;
    }

    public List<String> getUniqueNames() {
        // TODO
        return Collections.emptyList();
    }

    public List<Person> getPersonsSortedByNameAndSurname() {
        // TODO
        return Collections.emptyList();
    }
}
