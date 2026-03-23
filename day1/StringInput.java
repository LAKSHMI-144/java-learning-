import java.util.Scanner;

class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String place = sc.nextLine();

        System.out.println("Hello " + name + " from " + place + "!");
    }
}