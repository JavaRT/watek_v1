package pak3;

import java.time.Duration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("type smth1: ");
        String COSTAM1 = scanner1.nextLine();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                try {
                    Thread.sleep(Duration.ofSeconds(5).toMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hello world!!! " + COSTAM1);
            }
        });
        t1.start();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("type smth2: ");
        String COSTAM2 = scanner2.nextLine();
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                try {
                    Thread.sleep(Duration.ofSeconds(10).toMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hello world!!! " + COSTAM2);
            }
        });
        t2.start();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("type smth: ");
        String COSTAM3 = scanner3.nextLine();
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                try {
                    Thread.sleep(Duration.ofSeconds(5).toMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hello world!!! " + COSTAM3);
            }
        });
        t3.start();
    }
}
