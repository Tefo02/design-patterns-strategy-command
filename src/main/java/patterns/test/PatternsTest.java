package patterns.test;

import patterns.command.*;
import patterns.strategy.*;


/**
 * @author stefo
 */

public class PatternsTest {
    public static void main(String[] args) {
        System.out.println("== Testando Strategy ==");
        testStrategy();

        System.out.println("\n== Testando Command ==");
        testCommand();
    }
    
    private static void testStrategy() {
        GameCharacter character = new GameCharacter(new MagicAttack());
        character.attack(); // Esperado: Ataque mágico lançado!

        character.setAttackStrategy(new MeeleAttack());
        character.attack(); // Esperado: Ataque corpo a corpo executado!
    }

    private static void testCommand() {
        Light light = new Light();

        Command turnOn = new TurnOnCommand(light);
        Command turnOff = new TurnOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOn);
        remote.pressButton(); // Esperado: A luz foi acesa.

        remote.setCommand(turnOff);
        remote.pressButton(); // Esperado: A luz foi apagada.
    }
}
