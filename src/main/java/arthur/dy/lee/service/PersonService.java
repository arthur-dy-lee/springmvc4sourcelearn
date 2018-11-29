package arthur.dy.lee.service;

import arthur.dy.lee.domain.Person;
import arthur.dy.lee.persistence.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonMapper mapper;

    public List<Person> listPerson(Person person) {
        List<Person> list = new ArrayList<Person>();
        Person p = new Person();
        p.setId("1");
        p.setName("n1");
        list.add(p);

        list.addAll(mapper.listPerson(person));
        return list;
    }

}
