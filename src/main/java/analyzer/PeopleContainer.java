package analyzer;

/**
 *
 * @author Alina
 */

import org.yaml.snakeyaml.Yaml;
import java.util.List;

public class PeopleContainer {
    private List<Person> people;
    
        // Добавляем сеттер
    public void setPeople(List<Person> people) {
        this.people = people;
    }
    
    public List<Person> getPeople() {
        return people;
    }
}