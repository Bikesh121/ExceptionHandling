package ExceptionClass;
import java.util.Scanner;

class CheckAgeException extends Exception{
    CheckAgeException(String message){
        super(message);
    }
}

public class CustomExceptionByConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age > 120 || age < 1){
            try{
                throw new CheckAgeException("Invalid age!");
            }
            catch(CheckAgeException e){
                System.out.println(e.getMessage());
            }
        }
        else{
            System.out.println("Your age is valid.");
        }

    }
}
