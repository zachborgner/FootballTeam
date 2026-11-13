package components.FootballTeam;

/**
 * {@code Player}.
 */
public final class Player {

    /**
     * Player position.
     */
    public enum Position {
        /** Quarterback. */
        QB,
        /** Running Back. */
        RB,
        /** Wide Receiver. */
        WR,
        /** Tight End. */
        TE,
        /** Offensive Line. */
        OL,
        /** Defensive Line. */
        DL,
        /** Linebacker. */
        LB,
        /** Cornerback. */
        CB,
        /** Safety. */
        S,
        /** Kicker. */
        K
    }

    /** The name of the player. */
    private final String name;
    /** The jersey number of the player. */
    private final int number;
    /** The position of the player. */
    private final Position position;

    /**
     * @param name
     *            name of player
     * @param number
     *            jersey number of player
     * @param position
     *            position of player
     */
    public Player(String name, int number, Position position) {
        this.name = name;
        this.number = number;
        this.position = position;
    }

    /**
     * @return name of player
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return jersey number of player
     */
    public int getNumber() {
        return this.number;
    }

    /**
     * @return position of player
     */
    public Position getPosition() {
        return this.position;
    }
}
