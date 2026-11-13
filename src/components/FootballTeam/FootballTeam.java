package components.FootballTeam;

/**
 * {@code FootballTeam}.
 */
public interface FootballTeam extends FootballTeamKernel {
    /**
     * @param name
     *            name of player to find
     * @return player with the given name, or null if no such player exists
     */
    Player findPlayer(String name);

    /**
     * @param number
     *            jersey number of player to find
     * @return player with the given jersey number, or null if no such player
     *         exists
     */
    Player findPlayer(int number);
}
