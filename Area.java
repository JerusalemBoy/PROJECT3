import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle = ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of the rectangle = ");
        double width = sc.nextDouble();
         double area = length * width;
         double area_of_a_triangle = 0.5 * area;

        System.out.println("Enter the side of the square = ");
        double side = sc.nextDouble();
        double area_of_a_square = side * side;

        System.out.println("Enter the radius of the circle = ");
        double radius = sc.nextDouble();
         double area_of_a_circle = 3.14 * radius * radius;

        System.out.println("Area of the rectangle = " + area);
        System.out.println("Area of a triangle = " + area_of_a_triangle);
        System.out.println("Area of a square = " + area_of_a_square);
        System.out.println("Area of a circle = " + area_of_a_circle);
        sc.close();
    }
}