import java.util.Scanner;

public class AnimalService {
    //Scopes:
    /* 
     Instance (object) Scope - the variable is specific to the object.
     Changing the varialbe will only change that objects specific form of the varible.

     Method Scope - A variable declared within a method is only accessible within that method. 
     It CANNOT be accessed by other methods in the object.

     Block Scope - Variables inside a block of code (defined by curly brackets) are only accessible
     inside that bloc, Method scope is essentially a specific form of block scope.
        - Think about if you create a varible in a loop it is only accessible within the loop. 

     Class Scope - static variables declared in the class. The same variable is 
     accessible to all objects of that class. Think shared across all objects of that type
     If I have a dog and my color variable is static if I modify that value all dogs are now whatever
     color it was modified to. 
     Creating the registration method for a website would be a good use of the static keyword for 
     a method. As each user registers for the website the same way.
     Keeping track of how many of your company locations are in a district would be a good use 
     of a static variable. 

     */

    Animal myAnimal;

    public AnimalService(Scanner sc){
        System.out.println("What is species of the animal?");
        String species = sc.nextLine();
        myAnimal = new Animal(species);
    }

    public void changeAnimalName(String name){
    
        myAnimal.setName(name);
    }

    public void getAnimalsName(){
        System.out.println(myAnimal.getName());
    }
    
}
