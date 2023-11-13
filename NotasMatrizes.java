package JavaInicial;

import java.util.Scanner;

public class NotasMatrizes {

	
		public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
		
			double vetor [] = new double [10];
			double matriz [][] = new double [10][4];
			double soma = 0;
			
			
			for(int L = 0; L < 10; L++) {
				System.out.println("\n|| DIGITE A NOTA DO ALUNO  ||"+ (L + 1)+": ");
				
				for(int C = 0; C < 4; C++) {
					System.out.print("\n"+ (C + 1)+ " BIMESTRE: ");
					matriz [L][C] = scanner.nextDouble();
				}
			}
			
			System.out.println("\n\t\t|| MEDIA GERAL DOS ALUNOS:  ||");
			
			for(int L = 0; L < 10; L++) {
				for(int C = 0; C < 4; C++) {
					soma += matriz[L][C];
					
				}
				vetor[L] = soma / 4;
				soma = 0;
				System.out.println("\n || ALUNO : "+(L + 1)+", media = "+ vetor[L] +" || "); 
				}

}
		}
