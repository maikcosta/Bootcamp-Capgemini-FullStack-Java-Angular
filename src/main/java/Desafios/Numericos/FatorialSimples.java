/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Entrada
A entrada contém um valor inteiro N (0 < N < 13).
Saída
A saída contém um valor inteiro, correspondente ao fatorial de N.

Exemplo de Entrada	Exemplo de Saída
4
24
 */

package Desafios.Numericos;

import java.util.Scanner;

public class FatorialSimples {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int n ;
        int fat = 1;
        n = input.nextInt();
        if(n>=0){
            for (int i = 1; i <= n ; i++){
                fat = fat * i;
            }
            System.out.println(fat);
        }
    }
}
