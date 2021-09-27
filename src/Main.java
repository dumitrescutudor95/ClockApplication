public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 100 ; i++) {
            System.out.println("TIC");

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println("SI");
            System.out.println("TAC");
        }
        System.out.println("Gata!");
    }
}
