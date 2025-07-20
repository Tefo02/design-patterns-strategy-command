package patterns.strategy;

/**
 * @author stefo
 */

public class Character {
    private AttackStrategy attackStrategy;
    
    public Character(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
    
    public void attack() {
        attackStrategy.attack();
    }
}
