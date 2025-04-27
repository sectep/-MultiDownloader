package threadrace;

// a class for racing, whcih uses priorities for time delaying.
public class Main {
    public static void main(String[] args) {
        // create an interface to hold players data.
        MyThread[] players = {
                MyThread.createAndRun("Racer1", Thread.MAX_PRIORITY),
                MyThread.createAndRun("Racer2", Thread.MIN_PRIORITY)
        };

        try {
            // examine the players interface.
            for (MyThread player : players) {
                System.out.println(player.thrd.getName() + " finished racing");
                player.thrd.join();
                System.out.println(player.thrd.getName() + " finished racing");
            }
        } catch (InterruptedException exc) {
            System.out.println("Racing has been interrupted.");
        }

        System.out.println("The race is over.");
    }
}
