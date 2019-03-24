public class FightingSimulation {
    public static void main(String[] args) {

        Fighter fighter = new Fighter(2);
        Orcs orc1 = new Orcs(1);
        Orcs orc2 = new Orcs(1);
        Orcs orc3 = new Orcs(1);

        double orcFightResult = fighter.attack() - orc1.defense();
        System.out.println("result is"+orcFightResult);
        if (orcFightResult>0){
            double levelOfLifeAfterAttack = orc1.getOrcNumberOfLives() -orcFightResult;
            System.out.println( "Orc1 live is"+levelOfLifeAfterAttack);
            if (levelOfLifeAfterAttack<=0){
                System.out.println("Orc1 died");
            }
        }



    }
}

