/*
 * This class is the framework to construct HR Person objects.
 * It also includes a toString Override to output the data to be  
 * database ready and a method to check if the Person being imported
 * is a duplicate. 
 */

public class Person {
    private String name; // holds the person's name
    private int height; // holds the person's height
    private int weight; // hold the person's height

    // constructor
    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // Source: CGPT: "how would I construct an override toString in java to output a
    // database ready string format
    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10s", name, height, weight);
    }

    // Method to check for duplicates
    @Override
    public boolean equals(Object o) {
        // if Object o is null then return false
        if (o == null)
            return false;

        // if Object o == this then return true
        if (o == this) {
            System.out.println("Caught a duplicate.");
            return true;
        }

        // if Object o is not an instance of Person then return false
        if (!(o instanceof Person))
            return false;

        // Declare a new variable of type Person (perhaps named p)
        // and assign it to Object o cast as type Person
        Person p = (Person) o;

        // if Person p has the same name, height, and weight as
        // this then return true
        if (name.equals(p.name) && height == p.height && weight == p.weight) {
            System.out.println("Caught a duplicate.");
            return true;
        } else
            return false;
    }

}
