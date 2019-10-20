public class Main {
    public static void main(String[] args) {
        Countdown countdown2 = new Countdown();

        CountdownThread thread1 = new CountdownThread(countdown2);
        thread1.setName("Thread 1");

        CountdownThread thread2 = new CountdownThread(countdown2);
        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();
    }

//    Method synchronisation - czyli tylko jeden wątek może wejść do metody.
//    NIe możemy synchronizować konstruktorów.
//    Natomiast możemy synchronizować bloki kodu (zamiast całych metod).
}
