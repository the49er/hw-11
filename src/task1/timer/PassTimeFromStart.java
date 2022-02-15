package task1.timer;

public class PassTimeFromStart extends Thread{
    int second;
    int minute;

    public PassTimeFromStart() {
        this.second = 1;

    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (getSecond() % 5 != 0) {
                if (getSecond() % 5 == 0) {
                    setSecond(second++);
                }
                System.out.println(getSecond());
            }
            second++;
            setSecond(second++);
        }
    }
}
