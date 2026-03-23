class MultiCasting {
    public static void main(String[] args) {
        int a = 100;
        double b = a;       // implicit
        int c = (int) b;    // explicit

        System.out.println("Original: " + a);
        System.out.println("To Double: " + b);
        System.out.println("Back to Int: " + c);
    }
}