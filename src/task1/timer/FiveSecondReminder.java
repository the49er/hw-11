package task1.timer;

public class FiveSecondReminder extends Thread{
    boolean isStarted;

    public FiveSecondReminder(boolean isStarted){
        this.isStarted = isStarted;
    }

    public boolean isStarted() {
        return isStarted;
    }


    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!isStarted()) {
                System.out.println("Прошло 5 секунд");
            }
        }
    }
}
