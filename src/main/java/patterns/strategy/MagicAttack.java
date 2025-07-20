package patterns.strategy;

/**
 * @author stefo
 */

public class MagicAttack 
        implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("Ataque mágico lançado!");
    }
    
}
