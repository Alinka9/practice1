package analyzer;

/**
 *
 * @author Alina
 */

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;
    private String city;
    private String address;
    
    // Пустой конструктор необходим для SnakeYAML
    public Person() {
    }
    
    // Геттеры и сеттеры
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getPatronymic() {
        return patronymic;
    }
    
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
}