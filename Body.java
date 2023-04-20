public class Body {
    String creatureName;
    String foodHabits;
    int numberOfLegs;

    public Body(String creatureName, int numberOfLegs,String foodHabits) {
        this.creatureName = creatureName;
        this.numberOfLegs = numberOfLegs;
        this.foodHabits=foodHabits;
    }
    public void wayOfWalking(){
        System.out.println("Based on number of legs");
    }
    public void foodHabits(){
        System.out.println("Based on the creature foodtype");
    }
    public void skillsSpecialised(){
        System.out.println("Individual to every creature");
    }
}