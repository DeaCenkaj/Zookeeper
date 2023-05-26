// Bat class
public class Bat extends Mammal {
    public Bat() {
        energyLevel = 300;
    }

    public void fly() {
        System.out.println("Bat takes off!");
        energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("Bat gains energy by eating humans!");
        energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("Town is on fire! Bat attacks!");
        energyLevel -= 100;
    }
}
