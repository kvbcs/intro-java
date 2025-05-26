package Exos;
import java.util.Scanner;

public class Multi {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            
            System.out.println(num * i);
        }
      }

}
