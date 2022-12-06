import java.util.Random;

public class Person {

    private String name;
    private String surname;
    private int tickets;
    final int min = 0;
    final String[] nameArray = {"Dmitry", "Olga", "Vitaly", "Makar",
            "Stephanie", "Evgeniy", "Lydia", "Samuel",
            "Bogdan", "Irina", "Vsevolod", "Savely",
            "Gregory", "Arkady", "Elizabeth", "Matvey",
            "Valentina", "Egor", "Fedor", "Tamara",
            "Konstantin", "Abram", "Raisa", "Antonina"};
    final String[] surnameArray = {"Volsky", "Postnikov", "Petrushina", "Karpovich",
            "Parin", "Doroshenko", "Biryukov", "Kettler",
            "Johanson", "Orlovsky", "Gugnina", "Barsov",
            "Mackenzie", "Shipbuilders", "Kudryashov", "Dyachenko",
            "Lunin", "Romashchuk", "Aigi", "Levin"};


    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public Person() {
        this("name", "surname", 0);
    }

    public String toString() {
        return (name + " " + surname + " has " + tickets + " tickets");
    }

    public Person generation(int maxTickets) {
        name = nameArray[new Random().nextInt(nameArray.length - 1)];
        surname = surnameArray[new Random().nextInt(surnameArray.length - 1)];
        tickets = new Random().nextInt((maxTickets - min) + 1) + min;
        return new Person(name, surname, tickets);
    }

    public void useЕicket(){
        tickets -=1;
    }
}
