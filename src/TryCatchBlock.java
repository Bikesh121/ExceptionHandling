import java.util.Scanner;

public class TryCatchBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []num = {5, 7, 10, 16, 20};

        System.out.println("Enter the index of an array: ");
        int ind = sc.nextInt();

        try{
            System.out.println("The number at entered index is: "+num[ind]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundException occurred!");
            System.out.println(e);
        }
    }
}
