package io.zipcoder.persistenceapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private static final String getAllPersons = "SELECT * FROM PERSON";
    private static final String getById = "SELECT * FROM PERSON WHERE ID = ?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void getPersonById(int id){
        this.jdbcTemplate.execute(getById);
    }

    public void getAllPersons(){
        this.jdbcTemplate.queryForList(getAllPersons);
    }

//    private List<Person> persons = new ArrayList<> (Arrays.asList(
//                new Person(1, "Joe", "Hendricks",
//                         "609-489-1817"),
//                new Person(2, "Jess", "Kuderski",
//                         "609-666-6666"),
//                new Person(3, "George", "Foreman",
//                        "555-444-1415"),
//                new Person(4, "Tony", "Iommi",
//                         "666-666-4311")
//        ));

//    public List<Person> getAllPersons(){
//        return this.persons;
//    }
//
//    public Person getPerson(int id){
//        return persons.stream().filter(t -> t.getId() == (id)).findFirst().get();
//    }
//
//    public void addPerson(Person person) {
//        persons.add(person);
//    }
//
//    public void updatePerson(int id, Person person) {
//        for(int i = 0; i < persons.size(); i++){
//            Person p = persons.get(i);
//            if(p.getId() == id){
//                persons.set(i, person);
//                return;
//            }
//        }
//    }
//
//    public void deletePerson(int id) {
//        persons.removeIf(p -> p.getId() == (id));
//    }
}
