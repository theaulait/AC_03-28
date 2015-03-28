package nyc.c4q.theaulait;

/**
 * Created by c4q-vanice on 3/28/15.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Kennel {
    ArrayList<Dog> Kennel;

    public Kennel(){
    this.Kennel = new ArrayList<Dog>();
    }

    public void addDog(Dog myDog){
        this.Kennel.add(myDog);
        }
    public int numOfDogs(){
        return Kennel.size();
    }
    public boolean hasDogs(){
        return ! Kennel.isEmpty();
    }
    public void shutDownKennel(){
        this.Kennel.clear();
    }
    public void displayInventory(){
        System.out.println("Current Inventory: ");
        for (int i = 0; i < Kennel.size(); i++);
    }
}
