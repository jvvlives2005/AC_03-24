package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/24/15.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class NameTracker {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ana");

        /**System.out.println("Please give me some names:");
        for (int i = 0; i < 5; i++){
            names.add(input.next());
        }

        System.out.println("Your name(s) are saved!");*/

        String newName = input.next();

        while (true) {
            String nuevoName= input.nextLine();
            if (newName.equals("")) {
                break;
            }
            names.add(newName);
        }

        System.out.println("Your " + names.size() + " names are saved!");
        for (int i = names.size () -1; i >=0; i--) {
            System.out.println(names.get(i));
        }

        System.out.println(names.contains("Aileen"));

        System.out.println("Search for a name:");

    }
}
