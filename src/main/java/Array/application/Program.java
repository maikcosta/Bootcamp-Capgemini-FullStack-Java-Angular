package Array.application;

import Array.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many products");
        int n = sc.nextInt();

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

        double sum = 0.0;
        for (int i=0; i<vect.length; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}
