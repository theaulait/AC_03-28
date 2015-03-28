package nyc.c4q.theaulait;

/**
 * Created by c4q-vanice on 3/28/15.
 */

import java.util.ArrayList;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getDog() {return this.name;}

    public String getBreed() {
        return this.breed;
    }

    public int getAge() {return this.age; }

    public String setName(String name) { return this.name; }

    public String setBreed(String breed) { return this.breed;}

    public int setAge(int age) { return this.age;}

}
