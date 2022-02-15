package task2.fizzbuzz;

public class NumberProcessorThread extends Thread{
    int number;
    InputNumProcessor inputNumProcessor;

    public NumberProcessorThread (InputNumProcessor inputNumProcessor) {
        this.inputNumProcessor = inputNumProcessor;

    }

    void inputNumber (int number) {
        this.number = number;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            inputNumProcessor.inputNumber(number);
        }
    }
}
