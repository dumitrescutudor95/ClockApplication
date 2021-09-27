public class Main {

    public static void main(String[] args)
        throws InterruptedException {
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
