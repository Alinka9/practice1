package analyzer;

/**
 *
 * @author Alina
 */

import org.yaml.snakeyaml.Yaml;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class PracticePersons {
    public static void main(String[] args) {
        try {
            // Устанавливаем кодировку консоли
            System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
            
            // Загружаем файл как ресурс
            InputStream inputStream = PracticePersons.class.getResourceAsStream("/persons.yml");
            
            if (inputStream == null) {
                throw new Exception("Файл данных не найден");
            }
            
            // Создаем Reader с UTF-8 кодировкой
            InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);

            Yaml yaml = new Yaml();
                

            // Читаем список людей
            PeopleContainer containers = yaml.loadAs(reader, PeopleContainer.class);
            List<Person> people = containers.getPeople();
            
                for (Person p : people) {
                    System.out.println("ФИО: " + p.getFirstName() + " " + p.getPatronymic() + " " + p.getLastName());
                    System.out.println("АДРЕС: " + p.getCity() + ", " + p.getAddress());
                    System.out.println("------------------------");
                }
            

        } catch (Exception e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
            e.printStackTrace();
        }
    }
}