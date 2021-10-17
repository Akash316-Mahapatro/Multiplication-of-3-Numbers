import java.util.Scanner;
public class MultiplicationOf3Numbers {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of the first number ::");
      int a = sc.nextInt();
      System.out.println("Enter the value of the first number ::");
      int b = sc.nextInt();
      System.out.println("Enter the value of the third number ::");
      int c = sc.nextInt();
      int result = a*b*c;
      System.out.println("Product of the given two numbers is ::"+result);
   }
}