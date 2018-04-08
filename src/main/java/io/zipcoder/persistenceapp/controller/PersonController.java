package io.zipcoder.persistenceapp.controller;

import io.zipcoder.persistenceapp.service.PersonService;
import io.zipcoder.persistenceapp.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public ResponseEntity<?> getAllPersons(){
        personService.getAllPersons();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getSinglePersonById(@PathVariable int id){
        personService.getSinglePersonById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

//    @RequestMapping("/persons")
//    public List<Person> getAllPersons(){
//        return personService.getAllPersons();
//    }
//
//    @RequestMapping("/persons/{id}")
//    public Person getPerson(@PathVariable int id){
//        return personService.getPerson(id);
//    }
//
//    @RequestMapping(method = RequestMethod.POST, value = "/persons")
//    public void addPerson(@RequestBody Person person){
//        personService.addPerson(person);
//    }
//
//    @RequestMapping(method = RequestMethod.PUT, value = "/persons/{id}")
//    public void updatePerson(@RequestBody Person person, @PathVariable int id){
//        personService.updatePerson(id, person);
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE, value = "/persons/{id}")
//    public void deletePerson(@PathVariable int id){
//        personService.deletePerson(id);
//    }

}
