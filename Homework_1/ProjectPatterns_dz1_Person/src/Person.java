import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected Integer age = null;
    protected String address = null;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        return age != null;
    }
    public boolean hasAddress() {
        return address != null;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() {
        if (hasAddress()){
            return address;
        }else {
            return "Адрес не указан";
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void happyBirthday() {
        if(hasAge()){
            age += 1;
        }
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder()
                .setSurname(surname)
                .setAge(0);
        return (address != null) ? personBuilder.setAddress(address) : personBuilder;
    }

    @Override
    public String toString() {
        String person = "Person:" +
                " name = " + name +
                ", surName = " + surname;
        StringBuilder sb = new StringBuilder(person);
        if(age != null){
            sb.append(", age = ").append(age);
        }
        if(address != null){
            sb.append(", address = ").append(address);
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return (name.hashCode() + surname.hashCode() + age.hashCode() + address.hashCode());
    }
}
