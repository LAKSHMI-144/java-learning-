import java.util.Scanner;   
class PosiNegi{
    public static void main (String arga[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   
        if(a>0)
            System.out.println(a + " is positive.");
        else if(a<0)
            System.out.println(a + " is negative.");
        else
            System.out.println(a + " is zero.");    
       }
}