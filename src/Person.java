public class Person {
    private final String name;
    private final String emailAddress;
    public Person(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", emailAddress=" + emailAddress +
                '}';
    }


}
