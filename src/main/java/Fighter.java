import java.util.Random;

public class Fighter implements PossibleMoves {
    private double fighterNumberOfLives;
    public double fighterPowerOfAttack;
    public double fighterDefenceEfficiency;

    public Fighter(double fighterNumberOfLives) {

        this.fighterNumberOfLives = fighterNumberOfLives;
    }

    public double getFighterNumberOfLives() {
        return fighterNumberOfLives;
    }

    public void setFighterNumberOfLives(double fighterNumberOfLives) {
        this.fighterNumberOfLives = fighterNumberOfLives;
    }

    @Override
    public double attack() {
        Random rand = new Random();
        fighterPowerOfAttack = rand.nextDouble();
        return fighterPowerOfAttack;
    }

    @Override
    public double defense() {
        Random rand = new Random();
        fighterDefenceEfficiency = rand.nextDouble();
        return fighterDefenceEfficiency;
    }
}
