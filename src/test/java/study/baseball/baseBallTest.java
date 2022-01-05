package study.baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * 기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.
 *
 * 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼,
 * 같은 수가 전혀 없으면 포볼 또는 낫싱이란 힌트를 얻고,
 * 그 힌트를 이용해서 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다.
 *
 * e.g.
 *  상대방(컴퓨터)의 수가 425일 때, 123을 제시한 경우 : 1스트라이크,
 *  456을 제시한 경우 : 1볼 1스트라이크, 789를 제시한 경우 : 낫싱
 *  위 숫자 야구 게임에서 상대방의 역할을 컴퓨터가 한다.
 *  컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다.
 *  게임 플레이어는 컴퓨터가 생각하고 있는 3개의 숫자를 입력하고,
 *  컴퓨터는 입력한 숫자에 대한 결과를 출력한다.
 *  이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
 *  게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
 */

// NumberGenerator
    // [] 1부터 9까지의 수를 만든다 다
    // [] 1~9 자리를 3자리를 만든다
    // [] 3자리는 모두 서로 달라야한다.

// Referee
    // [] 같은 수가 같은 자리에 있으면 스트라이크를 처리해준다.
    // [] 같은 수가 다른 자리에 있으면 볼로 처리해준다
    // [] 같은 수가 전혀 없으면 낫싱으로 처리해준다.

public class baseBallTest {

    @Test
    @DisplayName("1~9 사이의 수를 만든다")
    void case1() {
        NumberGenerator generator = new NumberGenerator();
        int number = generator.createNumber();
        assertThat(number >= 1 && number <= 9).isTrue();
    }

    @Test
    @DisplayName("3자리 수를 만든다.")
    void case2() {
        NumberGenerator generator = new NumberGenerator();
        List numbers = generator.createNumber3();
        assertThat(numbers.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("3자리가 서로 다른 숫자를 가지는지 확인한다.")
    void case3() {
        NumberGenerator generator = new NumberGenerator();
        List numbers = generator.createNumber3();
    }



}
