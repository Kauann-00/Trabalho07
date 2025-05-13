// Matriz
 

package com.mycompany.somamatriz;

public class SomaMatriz {
    public static void main(String[] args) {

        int[][] A = {
            {-10, 1, 4, 6},
            {2, 3, 2, 8}
        };
        int[][] B = {
            {1, 8, 4, -1},
            {0, 6, 3, -3}
        };
        

        int linhas = 2;
        int colunas = 4;
        

        int[][] C = new int[linhas][colunas];
        

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        

        System.out.println("Matriz A:");
        imprimirMatriz(A);
        

        System.out.println("Matriz B:");
        imprimirMatriz(B);
        

        System.out.println("Matriz C (A + B):");
        imprimirMatriz(C);
    }
    

    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}