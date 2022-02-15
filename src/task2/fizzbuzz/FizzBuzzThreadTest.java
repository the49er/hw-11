package task2.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzThreadTest{
    public static void main(String[] args) {
        FizzBuzzList fizzBuzzList = new FizzBuzzList();


        NumberProcessorThread fizz = new NumberProcessorThread((n) -> {
            if (n % 3 == 0) {
                fizzBuzzList.addValue(n);
            }
        });

        NumberProcessorThread buzz = new NumberProcessorThread((n) -> {
            if (n % 5 == 0) {
                fizzBuzzList.addValue(n);
            }
        });

        NumberProcessorThread fizzBuzz = new NumberProcessorThread((n) -> {
            if (n % 15 == 0) {
                fizzBuzzList.addValue(n);
            }
        });

        NumberProcessorThread number = new NumberProcessorThread((n) -> {
            if (n % 3 == 0 && n % 5 == 0) {
                fizzBuzzList.addValue(String.valueOf(n));
            }
        });

        List<NumberProcessorThread>  listThreads = new ArrayList<>();
        listThreads.add(fizz);
        listThreads.add(buzz);
        listThreads.add(fizzBuzz);
        listThreads.add(number);

        for (Thread listThread : listThreads) {
            listThread.start();
        }
        for (int i = 0; i < 100; i++) {
            for (NumberProcessorThread listThread : listThreads) {
                listThread.inputNumber(i);
            }
        }


    }
}
