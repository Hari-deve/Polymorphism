public class Classification {
    public static void main(String[] args) {
        WildAnimal wildAnimal=new WildAnimal("Lion",4,"Carnivorous","Forest");
        DomesticAnimal domesticAnimal=new DomesticAnimal("Dog",4,"Omnivorous","Land");
        Human human=new Human("Human Being",2,"Omnivorous","Land");

        wildAnimal.wayOfWalking();
        wildAnimal.foodHabits();
        wildAnimal.livingArea();
        wildAnimal.skillsSpecialised();
        System.out.println("********************");
        domesticAnimal.wayOfWalking();
        domesticAnimal.foodHabits();
        domesticAnimal.livingArea();
        domesticAnimal.skillsSpecialised();
        System.out.println("********************");
        human.wayOfWalking();
        human.foodHabits();
        human.livingArea();
        human.skillsSpecialised();
    }
}
