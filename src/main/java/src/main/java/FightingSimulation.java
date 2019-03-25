public class FightingSimulation {
    public static void main(String[] args) {

        Fighter fighter = new Fighter(2);
        Orcs orc1 = new Orcs(1);
        double orc1LevelOfLife = orc1.getOrcNumberOfLives();
        double fighterLevelOfLife = fighter.getFighterNumberOfLives();

        while (orc1LevelOfLife > 0 && fighterLevelOfLife > 0) {
            double fighterFightResult = fighter.attack() - orc1.defense();
            if (fighterFightResult > 0) {
                orc1LevelOfLife -= fighterFightResult;
            }
            double orcFightResult = orc1.attack() - fighter.defense();

            if (orcFightResult > 0) {
                fighterLevelOfLife = fighter.getFighterNumberOfLives() - orcFightResult;
            }
            System.out.println("Fighter level of life:" + fighterLevelOfLife);
            System.out.println("Orc level of life" + orc1LevelOfLife);
        }
            if (orc1LevelOfLife<=0){
                System.out.println("Fighter win");
            }
            else {
                System.out.println("Orc win");
            }
        }
    }


