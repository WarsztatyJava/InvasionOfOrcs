public class FightingService {
    public static void main(String[] args) {

        Fighter fighter = new Fighter(2, 2);
        Orcs orc1 = new Orcs(1, 2);
        double orc1LevelOfLife = orc1.getOrcNumberOfLives();
        double fighterLevelOfLife = fighter.getFighterNumberOfLives();

        double finallyFighterInitialPoints = fighter.initialPointsGenerator();
        System.out.println("finallyFighterInitialPoints: " + finallyFighterInitialPoints);
        double finallyOrcInitialPoints = orc1.initialPointsGenerator();
        System.out.println("finallyOrcInitialPoints: " + finallyOrcInitialPoints);

        if (finallyFighterInitialPoints < finallyOrcInitialPoints) {
            System.out.println("Orc is starting!");
            double orcFightResult = orc1.attack() - fighter.defense();

            if (orcFightResult > 0) {
                fighterLevelOfLife -= orcFightResult;
                System.out.println("Fighter level of life" + fighterLevelOfLife);


            }

        } else {
            System.out.println("Fighter is starting");


        }

        while (orc1LevelOfLife > 0 && fighterLevelOfLife > 0) {
            double fighterFightResult = fighter.attack() - orc1.defense();
            if (fighterFightResult > 0) {
                orc1LevelOfLife -= fighterFightResult;
                System.out.println("Orc level of life" + orc1LevelOfLife);
            }
            double orcFightResult = orc1.attack() - fighter.defense();

            if (orcFightResult > 0) {
                fighterLevelOfLife -= orcFightResult;
                System.out.println("Fighter level of life:" + fighterLevelOfLife);
            }


        }
        if (orc1LevelOfLife < fighterLevelOfLife) {
            System.out.println("Fighter win");
        } else {
            System.out.println("Orc win");
        }
    }

}


