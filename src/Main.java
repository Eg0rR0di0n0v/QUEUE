import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        final int numPerson = 5;
        final int maxTickets = 10;
        Queue<Person> qPerson = generateClients(numPerson, maxTickets);

        while (!qPerson.isEmpty()) {
            Person bufPerson = qPerson.remove();
            if (bufPerson.numTicket() > 0) {
                bufPerson.useTicket();
                qPerson.add(bufPerson);
                System.out.println(bufPerson.fullName() + "took a ride on the attraction." +
                        " Tickets left: " + bufPerson.numTicket());
            } else {
                System.out.println(bufPerson.fullName() + "went home!!!");
            }
        }

    }

    public static LinkedList<Person> generateClients(int numPerson, int maxTickets) {
//        Queue<Person> qPerson
        LinkedList<Person> generateClients = new LinkedList<>();
        Person newPerson = new Person();
        System.out.println("______________DATA______________");
        for (int i = 0; i < numPerson; i++) {
            generateClients.offer(newPerson.generation(maxTickets));
            System.out.println(newPerson);
        }
        System.out.println("________________________________");
        return generateClients;
    }
}