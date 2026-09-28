package ExceptionClass;
import java.util.Scanner;

class OddException extends Exception{
    @Override
    public String getMessage(){
        return "Error: You entered an odd number!";
    }
}

public class GetMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an even number: ");
        int num = sc.nextInt();

        if(num %2 != 0){
            try{
                throw new OddException();
            }
            catch(OddException e){
                System.out.println(e.getMessage());
            }
        }
        else{
            System.out.println(num+" is an even number.");
        }
    }
}
