package ExceptionClass;
import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "You are under age!";
    }
}

public class ToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age < 18){
            try{
                throw new MyException();
            } catch (MyException e) {
                System.out.println(e.toString());
            }
        }
        else{
            System.out.println("You are eligible!");
        }
    }
}
