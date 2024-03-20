import java.util.ArrayList;
import java.util.Iterator;

public class Contacts implements Iterable<Person> {
    private final ArrayList<Person> contact = new ArrayList<>();
    public void addPerson(Person a){
        contact.add(a);
    }
    @Override
    public Iterator<Person> iterator() {
        return contact.iterator();
    }
}
