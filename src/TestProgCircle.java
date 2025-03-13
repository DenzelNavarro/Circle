import java.util.*;

public class TestProgCircle {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        Circle firstCircle = new Circle();
        Circle secondCircle = new Circle(12);

        double radius;

        System.out.println("First Circle: " + firstCircle);
        System.out.println("Second Circle: " + secondCircle);

        System.out.print("Enter the radius: ");
        radius = console.nextDouble();
        System.out.println();

        firstCircle.setRadius(radius);

        System.out.println("First Circle: " + firstCircle);

        if (firstCircle.getRadius() > secondCircle.getRadius()) {
            System.out.println("The radius of the first circle is greater than the radius of the second circle");
        } else if (firstCircle.getRadius() < secondCircle.getRadius()) {
            System.out.println("The radius of the first circle is less than the radius of the second circle");
        } else {
            System.out.println("The radius of both the circles are the same");
        }
    }
}
