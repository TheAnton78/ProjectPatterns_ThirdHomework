public class PersonBuilder {
    protected String name = null;
    protected String surname = null;
    protected Integer age = null;
    protected String address = null;

    public PersonBuilder setName(String name) {
        if (!Character.isUpperCase(name.toCharArray()[0])){
            throw new IllegalArgumentException("Фамилия должна начинаться с заглавной буквы");
        }
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        if (!Character.isUpperCase(surname.toCharArray()[0])){
            throw new IllegalArgumentException("Фамилия должна начинаться с заглавной буквы");
        }
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) {
        if(age < 0 ){
            throw new IllegalArgumentException("Возраст не может быть меньше нуля");
        }
        this.age = age;
        return this;
    }
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if(name == null && surname == null){
            throw new IllegalStateException("Вы не указали имя и фамилию");
        }
        if(name == null || surname == null){
            throw (name == null) ? new IllegalStateException("Вы не указали имя") : new IllegalStateException("Вы не указали фамилию");
        }
        Person person = (age != null) ? new Person(name, surname, age) : new Person(name, surname);
        if(address != null){
            person.setAddress(address);
        }
        return person;
    }
}