import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []num = {3, 5, 2, 7, 4};

        try{
            System.out.println("Enter two integers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int c = a/b;
            System.out.println("Result of Division: "+c);

            try{
                System.out.println("Enter the index of an array: ");
                int index = sc.nextInt();

                System.out.println("The number at entered index is: "+num[index]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Error: Array index not found!");
            }
        }
        catch(ArithmeticException e){
            System.out.println("Error: cannot divide by zero!");
        }
        catch(InputMismatchException e){
            System.out.println("Error: must input integers!");
        }
    }
}
