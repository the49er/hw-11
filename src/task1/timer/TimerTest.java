package task1.timer;

import java.lang.reflect.ParameterizedType;
import java.util.Timer;

public class TimerTest {
    public static void main(String[] args) {


        PassTimeFromStart passTimeFromStart = new PassTimeFromStart();
        FiveSecondReminder fiveSecondReminder = new FiveSecondReminder(passTimeFromStart.isAlive() );

        passTimeFromStart.start();
        fiveSecondReminder.setDaemon(true);
        fiveSecondReminder.start();

    }
}
