package components.FootballTeam;

import components.sequence.Sequence;
import components.sequence.Sequence1L;

/**
 * {@code FootballTeam1}.
 */
public final class FootballTeam1 implements FootballTeamKernel {

    /**
     * Representation of {@code this}.
     */
    private Sequence<Player> rep;

    /**
     * Initializes a new representation of {@code this}.
     */
    private void createNewRep() {
        this.rep = new Sequence1L<Player>();
    }

    /**
     * Initializes a new FootballTeam1.
     */
    public FootballTeam1() {
        this.createNewRep();
    }

    @Override
    public void addPlayer(Player player) {
        assert player != null : "Violation of: player is not null";
        assert !this
                .hasPlayer(player.getName()) : "Violation of: !hasPlayer(name)";

        this.rep.add(0, player);
    }

    @Override
    public Player removePlayer(String name) {
        assert this.hasPlayer(name) : "Violation of: hasPlayer(name)";
        assert name != null : "Violation of: name is not null";

        for (int i = 0; i < this.rep.length(); i++) {
            if (this.rep.entry(i).getName().equals(name)) {
                return this.rep.remove(i);
            }
        }
        return null;
    }

    @Override
    public boolean hasPlayer(String name) {
        boolean contains = false;
        for (int i = 0; i < this.rep.length(); i++) {
            if (this.rep.entry(i).getName().equals(name)) {
                contains = true;
            }
        }
        return contains;
    }

    @Override
    public int size() {
        return this.rep.length();
    }
}
