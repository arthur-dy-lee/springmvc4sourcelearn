package arthur.dy.lee.persistence;

import arthur.dy.lee.domain.Person;

import java.util.List;

public interface PersonMapper {
    List<Person> listPerson(Person person);

}
