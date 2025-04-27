package threadrace;

// A class,which creates a thread.
class MyThread implements Runnable {
    Thread thrd;
    int time;

    // create a Thread, using MyThread constructor.
    MyThread(String name) {
        thrd = new Thread(this, name);
    }

    // create Thread, set priority and start it.
    public static MyThread createAndRun(String name, int prioriry) {
        MyThread myThrd = new MyThread(name);

        myThrd.thrd.setPriority(prioriry);
        myThrd.thrd.start();
        return myThrd;

    }

    // start a Thread.
    public void run() {

        // print dots, given by priority.
        System.out.println(thrd.getName() + " is running");
        for (int i = 0; i < 4; i++) {
            try {
                System.out.println(".");
                time = thrd.getPriority() == 1 ? 500 : 100; // set the time, depending on priority.
                Thread.sleep(time);
            } catch (InterruptedException exc) {
                System.out.println("Running process has been interrupted for " + thrd.getName());
            }
        }
    }
}