package patterns.strategy;

/**
 * @author stefo
 */

public class MeeleAttack 
        implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("Ataque corpo a corpo executado!");
    }
    
}
