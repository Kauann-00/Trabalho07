// Matriz

package com.mycompany.matriz2x4;

import java.util.Scanner;

public class Matriz2x4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int LINHAS = 2;
        final int COLUNAS = 4;
        
        // Cria a matriz 2x4
        int[][] matriz = new int[LINHAS][COLUNAS];
        
        // Lê os elementos da matriz
        System.out.println("Digite os elementos da matriz 2x4:");
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                try {
                    matriz[i][j] = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Erro: Digite um número inteiro válido.");
                    scanner.close();
                    return;
                }
            }
        }
        
        System.out.println("\nMatriz 2x4:");
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println();
        }
        
        scanner.close();
    }
}