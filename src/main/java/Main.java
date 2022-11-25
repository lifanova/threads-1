public class Main {
    public static void main(String[] args) {
        ThreadGroup threadsGroup = new ThreadGroup("threadGroup");

        final Thread thread1 = new Thread(threadsGroup, new MyThread("1"));
        final Thread thread2 = new Thread(threadsGroup, new MyThread("2"));
        final Thread thread3 = new Thread(threadsGroup, new MyThread("3"));
        final Thread thread4 = new Thread(threadsGroup, new MyThread("4"));

        System.out.println("Создаю потоки...");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        System.out.printf("Я - %s, главный поток!\n", Thread.currentThread().getName());

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            System.out.println("Пока я ждал, меня пытались завершить!");
        }

        System.out.println("\nЗавершаю все потоки:");
        threadsGroup.interrupt();

    }
}
