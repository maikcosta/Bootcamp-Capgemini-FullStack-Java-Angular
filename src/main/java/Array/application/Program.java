package Array.application;

import Array.entities.Product;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    private static Product[] vect;
    private static Double avg;
    private static Double sum;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many products");
        Integer n = 0 ;
        try{
            n = sc.nextInt();

            Product[] vect = new Product[n];

            for (int i=0; i<vect.length; i++){
                sc.nextLine();
                int item = i +1;
                System.out.println(item +" - Insert product name");
                String name = sc.nextLine();
                System.out.println(item + " - Insert product value (EX: 900.00)");
                double price = sc.nextDouble();
                vect[i] = new Product(name,price);
            }
        sum = 0.0;

        for (int i=0; i<n; i++){
            sum += vect[i].getPrice();
        }
        avg = sum / n;
        }catch(InputMismatchException e){
            System.out.println("Please insert number only " + e.getMessage());
        }catch(NullPointerException e){
            System.out.println("Null" + e.getMessage());
        }
        if(avg != null){
            System.out.printf("AVERAGE PRICE = %.2f%n", avg);
        }

        sc.close();
    }
}
