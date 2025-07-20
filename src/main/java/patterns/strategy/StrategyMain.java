package patterns.strategy;

/**
 * @author stefo
 */

public class StrategyMain {
    public static void main(String[] args) {
        
        Character character = new Character(new MagicAttack());
        character.attack();  // Saída: Ataque mágico lançado!

        character.setAttackStrategy(new MeeleAttack());
        character.attack();  // Saída: Ataque corpo a corpo executado!
    }
}