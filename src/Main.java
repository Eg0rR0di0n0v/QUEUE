import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> qPerson = new LinkedList<>();
        Person newPerson = new Person();
        int numPerson = 5;
        int maxTickets = 10;

        for (int i = 0; i < numPerson; i++) {
//            newPerson = newPerson.generation(maxTickets);
//            System.out.println(newPerson.toString());
            System.out.println(qPerson.offer(newPerson.generation(maxTickets)) + " " + i);
//            qPerson.add(newPerson);
            System.out.println(newPerson.toString());
        }

        System.out.println();
        System.out.println(qPerson.size());
        System.out.println(qPerson.peek());
        System.out.println();
//        while (!qPerson.isEmpty()) {
////            newPerson = qPerson.poll();
//            System.out.println(qPerson.poll().toString());
//        }
//        Queue<String> test = new LinkedList<>();
//
//        for (int i = 0; i < 3; i++ ){
//            test.offer("Egor" + Integer.toString(i));
//        }
//        while (!qPerson.isEmpty()){
//            System.out.println(qPerson.peek());
//            System.out.println(qPerson.poll());
//        }
        for (int i = 0;i <= numPerson; i++){
            System.out.println(qPerson.poll());
        }
    }
}