package constants;

public enum GameEnded {
    PLAYER_ONE_WON("Player one killed the enemy hero."),
    PLAYER_TWO_WON("Player two killed the enemy hero.");

    private final String message;

    GameEnded(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
