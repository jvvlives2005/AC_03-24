package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/24/15.
 */
/**
 * Access Code 2.1
 *
 * Author  Joshelyn
 * Date    March 2015
 *
 * This class asks the user which car they have and prints its price.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class BlueBook {

    public static void main(String[] args) {
        // 1. Create a Scanner for user input.
        Scanner input = new Scanner(System.in);

        // 2. Create an ArrayList that holds type Car.
        ArrayList<Car>garage = new ArrayList<Car>();


        // 3. Create a few new Car objects and add them to the ArrayList.
      Car firstCar = new Car("Toyoda", "Camri", 1999, 20000.00);            //this is an instance
      Car secondCar = new Car("Chevrolet", "Volt", 2013, 22600.00);
      Car thirdCar = new Car("Nissan", "LEAF", 2011, 14750.00);
      Car fourthCar = new Car("Volkwagen",  "Beetle", 2000, 13750.00);

        garage.add(firstCar);
        //garage.add(new Car()); -- another way of doing it
        garage.add(secondCar);
        garage.add(thirdCar);
        garage.add(fourthCar);
        garage.add(new Car("Audi", "A6", 2005, 15000.00));


        // 4. Prompt the user for the car's make, model, and year, and store the inputs in variables.
        System.out.println("What is your car's make?");
        String make = input.nextLine();
        System.out.println("What is your " + make + "'s model?");
        String model = input.nextLine();
        System.out.println("What is your " + make + " " +  model + "'s year?");
        int year = input.nextInt();


        // 5. Iterate over your ArrayList of cars and check for a Car instance that has the same...
        //    ...make
        //    ...model
        //    ...year
        double price = 0.0;  //starting point
        for (int i = 0; i <= garage.size()-1; i++){ //so if you listed 5, the index starts from 0 to 4, hence the minus 1
            //garage.get(i);

            if(garage.get(i).getMake().equalsIgnoreCase(make)
                    && garage.get(i).getModel().equalsIgnoreCase(model)
                    && garage.get(i).getYear()==year) {

                price= garage.get(i).getPrice();
                System.out.println("Your " + year + " " + make + " " + model + " " + "is worth " + price +"0");
            }

        }

        if(price == 0.0){
            System.out.println("This is not in the Bluebook");
        }
        else {
            System.out.println("Your " + year + " " + make + " " + model + " " + "is worth " + price +"0");
        }
        // 6. Print the price of that car.


    }
}
