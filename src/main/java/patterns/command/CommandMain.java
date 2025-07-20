package patterns.command;

/**
 * @author stefo
 */

public class CommandMain {
    public static void main(String[] args) {
        Light light = new Light();
    
        Command turnOff = new TurnOffCommand(light);
        Command turnOn = new TurnOnCommand(light);

        RemoteControl remote = new RemoteControl();

        // Liga a luz
        remote.setCommand(turnOn);
        remote.pressButton();

        // Desliga a luz
        remote.setCommand(turnOff);
        remote.pressButton();
    }
}
