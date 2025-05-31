package task6;

public class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void giveVoice() {

    }

    @Override
    public void move() {

    }

    @Override
    public void animalDescription() {
        System.out.print(this.getName() + ", ma lat " + this.getAge() + ", ");

    }

    @Override
    public void getNaturalEnvironment() {

    }

    @Override
    public void makeSpecialMove() {

    }
}
