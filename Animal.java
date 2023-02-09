public class Animal {

    private String name;
    int age;
    final String species;
    static String color;
    // static String color;
    //4 access modifiers. 
    //Most restrictive to least restrictive
    // private - cannot access anything private outside of the class (police)
    // default (package private) - can only access anything within it's package (department)
    // protected - only access withing the class, package, and subclasses (protects)
    // public - everywhere has access (public)

    //non access modifiers
    // static - shared across all objects of that type. Meaning if I change something it effects them all. 
    // final - we can't change it. 
        // 1) Final variable - cannot be changed.
        // 2) Final methods - cannot be overridden.
        // 3) Final class - can not be extended. 
    // abstract - will discuss later

    
    public Animal(String species){
        this.species = species;
    }
    //Setter also known as accessor
    public void setName(String name){
        this.name = name;
    }
    //Getter also known as mutator 
    public String getName(){
        return name;
    }

    // public void changeName(){
    //     setName("Chimppy");
    // }
    
}
