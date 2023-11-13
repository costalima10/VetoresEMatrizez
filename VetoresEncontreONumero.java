package JavaInicial;

import java.util.Scanner;

public class EncontreONumeroVetores {

public static void main(String[] args) {
		
		int num, x;
		boolean procura = false;
		Scanner leia = new Scanner (System.in);
		
		int vetor [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		System.out.println("\n ||DIGITE O NUMERO QUE DESEJA ENCONTRAR:   ||");
		num = leia.nextInt();
		
		for (x=0; x<vetor.length; x++) {
			
			if(num == vetor[x]) {
				procura = true;
				System.out.println("\n || O NUMERO "+num+" ESTA NA POSIÇAO "+x+" || ");	
			}
			}
			
		if( ! procura ) {
			System.out.println("\n || O NUMERO "+num+" NAO FOI ENCONTRADO!! ||");
		}
	}
 
} 


