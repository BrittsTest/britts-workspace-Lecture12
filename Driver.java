import java.util.Scanner;

public class Driver{

    public static void main(String[] args){
        // Animal an = new Animal("Dog");
        // // an.species = "Chimp";
        // // an.age = 3;
        // // an.name = "Chimppy";
        // an.setName("Chimppy");
        // System.out.println(an.getName()); //Chimppy
        // Animal lulu = new Animal("Cat");
        // an.setName("Lulu");
        // System.out.println(lulu.getName()); //Lulu
        // System.out.println(an.getName());  //Lulu

        Scanner sc = new Scanner(System.in);
        AnimalService as = new AnimalService(sc);
        System.out.println("What would you like the animals name to be?");
        String name = sc.nextLine();
        as.changeAnimalName(name);
        System.out.println("Your animals name is: ");
        as.getAnimalsName();

        // Animal a1 = new Animal();
        // Animal a2 = new Animal();
        // Animal a3 = new Animal();
        // Animal.color = "Black";
        // Animal.color = "Pink";
        // Animal.color = "Green";

        // System.out.println(Animal.color); //black
        // System.out.println(Animal.color); // pink
        // System.out.println(Animal.color); //green
    }
}