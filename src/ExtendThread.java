public class MyThread extends Thread {

    // Override run() method
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();  // Create thread object
        t.start();                    // Start the thread
    }
}