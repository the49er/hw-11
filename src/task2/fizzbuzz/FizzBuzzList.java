package task2.fizzbuzz;

import java.util.List;

public class FizzBuzzList <T> {
    List<T> result;

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    void addValue (T value) {
        result.add(value);
    }
}
