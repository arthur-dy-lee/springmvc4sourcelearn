package arthur.dy.lee.controller;

import arthur.dy.lee.domain.Person;
import arthur.dy.lee.service.PersonService;
import arthur.dy.lee.util.page.BaseJsonRst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller("personController")
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonService personService;

    @RequestMapping("/list")
    public String listPerson(Person person, Model model) {
        List<Person> personList = personService.listPerson(person);
        model.addAttribute("personList", personList);
        return "listperson";
    }

    /**
     * http://localhost:8080/person/list2
     * @param person
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/list2", method= RequestMethod.GET)
    public BaseJsonRst<List<Person>> getForm(Person person){
        BaseJsonRst<List<Person>> ret =  new BaseJsonRst<List<Person>>();
        List<Person> list = new ArrayList<Person>();
        Person p = new Person();
        p.setId("1");
        p.setName("2");
        list.add(p);
        return ret.success(list);
    }

}
