import java.util.Scanner;

public class CarsMain {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Cars car1 = new Cars();
        System.out.print("Enter Year of Vehicle: ");
        car1.setYear(input.nextInt());
        input.nextLine();

        System.out.print("Enter Brand: ");
        car1.setBrand(input.nextLine());

        System.out.print("Enter Model: ");
        car1.setModel(input.nextLine());

        System.out.print("Enter Trim(Special Editions): ");
        car1.setTrim(input.nextLine());

        System.out.print("Enter Class(Sedan/HatchBack/Truck/SUV/Coupe/Vintage Clasic): ");
        car1.setCarClass(input.nextLine());

        System.out.print("Enter Engine Capacity: ");
        car1.setEngine(input.nextDouble());
        input.nextLine();

        System.out.print("Enter Cylinders (I4/I6/V6/V8/V10/V12/W12/W16/V16): ");
        car1.setCylinders(input.nextLine());

        System.out.print("Enter Horsepower: ");
        car1.setHorsepower(input.nextInt());

        System.out.print("Enter Price: ");
        car1.setPrice(input.nextDouble());

        System.out.println("Vehicle Info: ");
        car1.display();

    }
}
