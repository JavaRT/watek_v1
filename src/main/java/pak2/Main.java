package pak2;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                try {
                    Thread.sleep(Duration.ofSeconds(30).toMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("juhuu ");
            }
        });
        t1.start();
    }
}