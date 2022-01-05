package study.baseball;

import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {

    public int createNumber() {
        int number = (int) (Math.random() * 9) + 1;
        return number;
    }

    public List createNumber3() {
        List numbers = new ArrayList();
        NumberGenerator generator = new NumberGenerator();
        while (numbers.size() < 3) {
            int number = generator.createNumber();
            if (!numbers.contains(number)) {
                numbers.add(number);
            }
        }
        return numbers;
    }
}
