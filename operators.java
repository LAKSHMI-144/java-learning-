class OperatorsDemoo {
    public static void main(String[] args) {

        int a = 10, b = 5;

        // Arithmetic
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));

        // Relational
        System.out.println("a > b = " + (a > b));
        System.out.println("a == b = " + (a == b));

        // Logical
        System.out.println("(a > b && b > 0) = " + (a > b && b > 0));
        System.out.println("(a < b || b > 0) = " + (a < b || b > 0));
    }
}