public class Main {
    public static void main(String[] args) {
        Person aNewPerson1 = new Person("Brett", "example1@gmail.com");
        Person aNewPerson2 = new Person("Miguel", "example2@gmail.com");
        Person aNewPerson3 = new Person("Joseph", "example3@gmail.com");
        Person aNewPerson4 = new Person("Andrew", "example4@gmail.com");
        Person aNewPerson5 = new Person("Amal", "example5@gmail.com");
        Person aNewPerson6 = new Person("Ayub", "example6@gmail.com");
        Contacts alc = new Contacts();
        alc.addPerson(aNewPerson1);
        alc.addPerson(aNewPerson2);
        alc.addPerson(aNewPerson3);
        alc.addPerson(aNewPerson4);
        Contacts halleck = new Contacts();
        halleck.addPerson(aNewPerson5);
        halleck.addPerson(aNewPerson6);
        for(Person a : alc){
            System.out.println(a);
        }
        for(Person a : halleck){
            System.out.println(a);
        }

    }
}
