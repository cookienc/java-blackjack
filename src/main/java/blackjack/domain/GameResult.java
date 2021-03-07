package blackjack.domain;

public enum GameResult {

    WIN("승"),
    LOSE("패"),
    DRAW("무");

    private final String name;

    GameResult(final String name) {
        this.name = name;
    }

    public GameResult reverseResult() {
        if (this == WIN) {
            return LOSE;
        }
        if (this == LOSE) {
            return WIN;
        }
        return DRAW;
    }

    public String getName() {
        return name;
    }
}
