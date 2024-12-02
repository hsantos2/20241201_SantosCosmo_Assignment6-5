
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        //Prompt user to enter three numbers
        System.out.print("Enter three numbers: ");
        int number1= input.nextInt();
        int number2= input.nextInt();
        int number3= input.nextInt();

        //Put numbers in ascending order
        displaySortedNumbers(number1, number2, number3);
        
        int temp;

        if (number2<number1 && number2<number3){
            temp= number1;
            number1=number2;
            number2=temp;

        }

        else if (number3<number2){
            temp=number2;
            number2=number3;
            number3=temp;

        }

        //Display result

        System.out.println(number1 + " " + number2 + " " + number3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3){

    }
}
