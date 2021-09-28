import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        Person person = new Person(22, 178, "alb", new Clock(rand.nextInt(RandomTimes.lista.size())));
        System.out.println("The clock is starting");
        for (int i = 0; i <= 100 ; i++) {
            System.out.println("TIC");
            Thread.sleep(person.clock.getSecondsInterval()*1000);
            System.out.println("SI");
            System.out.println("TAC");
            Thread.sleep(person.clock.getSecondsInterval()*1000);
        }
        System.out.println("Gata!");
    }
}
