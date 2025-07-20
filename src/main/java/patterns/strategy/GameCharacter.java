package patterns.strategy;

/**
 * @author stefo
 */

public class GameCharacter {
    private AttackStrategy attackStrategy;
    
    public GameCharacter(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
    
    public void attack() {
        attackStrategy.attack();
    }
}
