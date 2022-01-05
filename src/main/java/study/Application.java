package study;

import study.baseball.NumberGenerator;
import study.baseball.Referee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Referee referee = new Referee();
        List<Integer> computer = new NumberGenerator().createNumber3();

        String play = referee.play(computer, input());
        while (!"3 스트라이크 0 볼 0 낫싱".equals(play)) {
            play = referee.play(computer, input());
        }
    }

    public static List<Integer> input() {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        String[] split = value.split("");
        List player = new ArrayList();
        Arrays.stream(split).forEach(item -> player.add(Integer.parseInt(item)));
        return player;
    }
}
