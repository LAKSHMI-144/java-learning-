import java.util.Scanner;

class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        double circleArea = Math.PI * r * r;
        System.out.println("Area of Circle: " + circleArea);

        // Rectangle
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();
        double rectangleArea = l * b;
        System.out.println("Area of Rectangle: " + rectangleArea);

        // Triangle
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        double triangleArea = 0.5 * base * h;
        System.out.println("Area of Triangle: " + triangleArea);
    }
}