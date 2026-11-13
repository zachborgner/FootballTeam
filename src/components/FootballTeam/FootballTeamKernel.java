package components.FootballTeam;

/**
 * Represents a football team.
 */
public interface FootballTeamKernel {

    /**
     * Adds a player to the team.
     *
     * @param player
     *            player to add
     * @requires player is non-null and has a unique name
     * @updates {@code this}
     * @ensures hasPlayer(player.getName())
     */
    void addPlayer(Player player);

    /**
     * Removes a player from the team.
     *
     * @param name
     *            name of player to remove
     * @updates {@code this}
     * @requires hasPlayer(name)
     * @ensures !hasPlayer(name)
     * @return the player with the given name
     */
    Player removePlayer(String name);

    /**
     * Checks if a player is on the team.
     *
     * @param name
     *            name of player to check
     * @return true if player is in FootballTeam, false otherwise
     */
    boolean hasPlayer(String name);

    /**
     * Returns the number of players on the team.
     *
     * @return size of FootballTeam
     * @ensures size = |this|
     */
    int size();
}
