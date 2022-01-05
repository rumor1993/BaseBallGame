package study.baseball;

import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {

    public int createNumber() {
        int number = (int) (Math.random() * 9) + 1;
        return number;
    }

    public List createNumber3() {
        ArrayList numbers = new ArrayList();
        for (int i = 0; i < 3; i++) {
            numbers.add(createNumber());
        }
        return numbers;
    }
}
