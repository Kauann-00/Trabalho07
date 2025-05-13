// Matriz

package com.mycompany.triangulopascal;

import java.util.Scanner;

public class TrianguloPascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Digite a ordem do Triângulo de Pascal (n): ");
        int n;
        try {
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Erro: A ordem deve ser um número positivo.");
                scanner.close();
                return;
            }
        } catch (Exception e) {
            System.out.println("Erro: Digite um número inteiro válido.");
            scanner.close();
            return;
        }
        

        long[][] matriz = new long[n][n];

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    matriz[i][j] = 1; // Primeira coluna e diagonal principal
                } else {
                    matriz[i][j] = matriz[i-1][j] + matriz[i-1][j-1]; // Soma dos elementos acima
                }
            }
        }
        

        System.out.println("\nTriângulo de Pascal de ordem " + n + ":");
        for (int i = 0; i < n; i++) {
           
            for (int k = 0; k < (n - i - 1) * 2; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.printf("%-6d", matriz[i][j]);
            }
            System.out.println();
        }
        
        scanner.close();
    }
}