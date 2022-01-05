package study.baseball;

import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class Referee {
    public BallType compareBall(List<Integer> computer, Ball ball) {
        if (computer.get(ball.getIndex()) == ball.getNumber()) return BallType.STRIKE;
        if (computer.contains(ball.getNumber())) return BallType.BALL;
        return BallType.NOTHING;
    }

    public String play(List<Integer> computer, List<Integer> player) {
        int strikeCount = 0;
        int ballCount = 0;
        int nothingCount = 0;

        List<BallType> ballTypes = new ArrayList<>();
        for (int i = 0; i < player.size(); i++) {
            BallType ballType = compareBall(computer, new Ball(i, player.get(i)));
            ballTypes.add(ballType);
        }

        for (BallType ballType : ballTypes) {
            if (BallType.STRIKE.equals(ballType)) strikeCount++;
            if (BallType.BALL.equals(ballType)) ballCount++;
            if (BallType.NOTHING.equals(ballType)) nothingCount++;
        }

        System.out.println(strikeCount + " 스트라이크 " + ballCount + " 볼 " + nothingCount + " 낫싱");
        return strikeCount + " 스트라이크 " + ballCount + " 볼 " + nothingCount + " 낫싱";
    }

}
