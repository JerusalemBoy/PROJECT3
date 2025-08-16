import java.util.Scanner;
public class User {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Asking for user input
        System.out.print("Enter Your Full Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your Age: ");
        String age = sc.nextLine();

        System.out.print("Enter Your Gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter Your Price: ");
        double price = sc.nextDouble();

        System.out.print("Is Java fun? (True/False): ");
        boolean Is_Java_Fun = sc.nextBoolean();

        // Printing Results
        System.out.println("\n-----My First Java Project-----");
        System.out.println("\n Name: " + name);
        System.out.println("\n Age: " + age);
        System.out.println("\n Gender: " + gender);
        System.out.println("\n Price: " + price);
        System.out.println("Is Java Fun?: " + Is_Java_Fun);

        sc.close();
    }
}
