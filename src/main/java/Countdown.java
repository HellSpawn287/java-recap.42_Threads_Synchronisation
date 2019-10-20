public class Countdown {
    private int i;

    public synchronized void doCountdown() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColours.ANSI_RED;
                break;
            case "Thread 2":
                color = ThreadColours.ANSI_BLUE;
                break;
            default:
                color = ThreadColours.ANSI_GREEN;
                break;
        }

        for (i = 10; i > 0; i--) {
            System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
        }
    }
}
