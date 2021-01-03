import person.Person;
import repository.InMemoryRepository;
import repository.PersonRepository;
import statistics.PersonStatistics;

public class Main {
    public static void main(String[] args) {
        PersonRepository personRepository = new InMemoryRepository();
        initRepository(personRepository);
        PersonStatistics personStatistics = new PersonStatistics(personRepository);

        System.out.println("Number of persons: " + personStatistics.getPersonsCount());
        System.out.println("The oldest person is: " + personStatistics.getTheOldestPerson());
        System.out.println("List:" + personRepository.getAllPersons());
        System.out.println("Number of persons: " + personStatistics.getPersonsCount());
        // etc
    }

    private static void initRepository(PersonRepository personRepository) {
        // here we feed repository with some exemplary data
        personRepository.save(new Person("Pavlo", "Fusiara", 22));
        personRepository.save(new Person("Michael", "jackson", 31));

    }
}
