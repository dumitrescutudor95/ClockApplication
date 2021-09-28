import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Person person = new Person(22, 178, "alb", new Clock(3));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        scanner.nextLine();
        System.out.println("Enter age: ");
        scanner.nextInt();

        System.out.println("The clock is starting");
        for (int i = 0; i <= 100 ; i++) {
            System.out.println("TIC");
            Thread.sleep(1000);
            System.out.println("SI");
            System.out.println("TAC");
            Thread.sleep(1000);
        }
        System.out.println("Gata!");
    }
}
