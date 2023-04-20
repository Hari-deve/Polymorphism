public class Human extends Body{
    String livingArea;

    public Human(String creatureName, int numberOfLegs,String foodHabits, String livingArea) {
        super(creatureName, numberOfLegs,foodHabits);
        this.livingArea = livingArea;
    }

    @Override
    public void wayOfWalking() {
        System.out.println(creatureName+"walks on "+numberOfLegs+" Legs");
    }

    @Override
    public void foodHabits() {
        System.out.println(creatureName+" is "+ foodHabits+" in nature");
    }

    @Override
    public void skillsSpecialised() {
        System.out.println(creatureName+" is good in Creativity");
    }
    public void livingArea(){
        System.out.println(creatureName+" lives in "+livingArea);
    }
}
