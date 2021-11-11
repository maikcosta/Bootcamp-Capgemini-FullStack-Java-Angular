package Desafios.Numericos;

import java.util.Scanner;

public class Problem {
    //complete os espaços em branco com sua solução
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        for (int i = 1; i <= 99 ; i++) {
            if (n % i == 0 ) {
                System.out.println( i );
            }
        }
    }
}
