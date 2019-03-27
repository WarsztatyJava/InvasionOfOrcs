import java.util.Random;

public class Fighter implements PossibleMoves {
    private double fighterNumberOfLives;
    private double fighterInitialPoints;
    public double fighterPowerOfAttack;
    public double fighterDefenceEfficiency;


    public Fighter(double fighterNumberOfLives, double fighterInitialPoints) {

        this.fighterNumberOfLives = fighterNumberOfLives;
        this.fighterInitialPoints=fighterInitialPoints;
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
        fighterDefenceEfficiency = rand.nextDouble()*0.5;
        return fighterDefenceEfficiency;
    }

    @Override
    public double initialPointsGenerator() {
        Random rand =new Random();
        double finalFighterInitialPoints= rand.nextDouble()+fighterInitialPoints;
        return finalFighterInitialPoints;
    }
}
