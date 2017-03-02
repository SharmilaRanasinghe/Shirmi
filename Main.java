/**
 * Created by Shirmila on 3/2/2017.
 */
public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        Person person=new Person();
        person.setName("peter");
        person.setEmail("peter@gmail.com");
        System.out.println(person.getName());
        System.out.println(main.savePerson(person));

    }
    public Person savePerson (Person person){
        if (person==null){
            throw new IllegalArgumentException();
        }else {
            person.setId("p100");
            return person;
        }
    }
}
