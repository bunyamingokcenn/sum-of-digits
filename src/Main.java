import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, basValue, total=0;


        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        while (number != 0){
            basValue = number % 10;
            total += basValue;
            number/=10;
        }
        System.out.println(total);
    }
}