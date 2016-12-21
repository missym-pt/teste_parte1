package teste_final;

import java.util.*;

public class Ex_1 {

	public Ex_1() {

		/*É pedido ao utilizador que introduza 5 caracteres, que serão gravados num array de char;
		Indique ao utilizador quantos caracteres correspondem a um número entre 0 e 9.*/
		
		Scanner in=new Scanner(System.in);
		char arr[]=new char[5];
		int cont=0;
		
		for(int i=0; i <5; i++){
			System.out.println("Introduza um caracter: ");
		    arr[i]=in.next().charAt(0);
		    cont= (int)arr[i]-48<=9 &&  (int)arr[i]-48>=0 ? cont + 1:cont;
		    }
		
		System.out.println("Introduziu " + cont + " numeros entre 0 e 9" );
		
	}}


