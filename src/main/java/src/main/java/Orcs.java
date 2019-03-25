import java.util.Random;

public class Orcs implements PossibleMoves {
    public double getOrcNumberOfLives() {
        return orcNumberOfLives;
    }

    public void setOrcNumberOfLives(double orcNumberOfLives) {
        this.orcNumberOfLives = orcNumberOfLives;
    }

    private double orcNumberOfLives;
    public double orcPowerOfAttack;
    public double orcDefenceEfficiency;

    public Orcs(double orcNumberOfLives) {

        this.orcNumberOfLives = orcNumberOfLives;


    }

    @Override
    public double attack() {
        Random rand = new Random();
        orcPowerOfAttack = rand.nextDouble();
        return orcPowerOfAttack;

    }

    @Override
    public double defense() {
        Random rand = new Random();
        orcDefenceEfficiency = rand.nextDouble()*0.5;
        return orcDefenceEfficiency;

    }
}
