package Exos;
import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un premier entier : ");
        int num1 = scanner.nextInt();
        System.out.print("Entrez un deuxième entier : ");
        int num2 = scanner.nextInt();
        int multiplied = num1 * num2;
        int addition = num1 + num2;
        int substraction = num1 - num2;
        int division = num1 / num2;
        System.out.println(addition);
        System.out.println(substraction);
        System.out.println(multiplied);
        System.out.println(division);

      
    }
}
