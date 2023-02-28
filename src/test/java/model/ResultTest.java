package model;

import model.card.Card;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static model.card.Shape.CLOVER;
import static model.card.Shape.DIAMOND;
import static model.card.Shape.HEART;
import static model.card.Shape.SPADE;
import static model.card.Value.ACE;
import static model.card.Value.NINE;
import static model.card.Value.TEN;
import static model.card.Value.TWO;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ResultTest {

    private Result result;
    private Player bebe;
    private Player ethan;

    @BeforeEach
    void init() {
        bebe = new Player("bebe");
        ethan = new Player("ethan");
        result = new Result(new Players(List.of("bebe", "ethan")));
    }

    @Test
    @DisplayName("기존 Map에 Card를 추가한다.")
    void addCard() {
        // given
        Card card = new Card(CLOVER, ACE);

        // when
        result.addCard(bebe, card);

        // then
        assertThat(result.getScoreBoards().get(bebe)).containsExactly(card);
    }

    @Test
    @DisplayName("Player의 카드 숫자의 총 합이 21이하 인지 확인한다.")
    void canPlayerReceiveCard() {
        // given
        final Card cloverTen = new Card(CLOVER, TEN);
        final Card heartNine = new Card(HEART, NINE);
        final Card diamondTwo = new Card(DIAMOND, TWO);

        result.addCard(bebe, cloverTen);
        result.addCard(bebe, heartNine);
        result.addCard(bebe, diamondTwo);

        // when, then
        assertAll(
                () -> assertThat(result.canPlayerReceiveCard(bebe)).isTrue(),

                () -> {
                    result.addCard(bebe, new Card(SPADE, ACE));
                    assertThat(result.canPlayerReceiveCard(bebe)).isFalse();
                }
        );
    }
}