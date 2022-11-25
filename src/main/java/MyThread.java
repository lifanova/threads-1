public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.printf("Я - поток %s. Всем привет!\n", getName());
            }
        } catch (InterruptedException e) {

        } finally {
            System.out.printf("Поток %s завершён.\n", getName());
        }
    }
}
