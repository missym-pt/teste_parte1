package teste_final;

import java.util.Random;
import java.util.Scanner;

public class Ex_2 {
	
	public Ex_2() {
		// TODO Auto-generated constructor stub
		
		Random rand = new Random();
		int x=0;
		int x0=rand.nextInt(20);
		char escolha='1';
		Scanner reader=new Scanner(System.in);
		int cont=0;
			
		while (escolha!='0'){
			
			System.out.println("O numero � o " + x0);	
			System.out.println("Fa�a a sua aposta: o pr�ximo n�mero ser� maior ou menor? " );
			System.out.println("Escolha c se maior ou b se menor. " );
			
			do{
			escolha= reader.next().charAt(0);
			if(escolha !='b' && escolha !='c'){
				System.out.println(" Essa escolha n�o � v�lida. Escolha c se maior ou b se menor. " );}
			else{break;}
			}while(escolha !='b' && escolha !='c');
			
		do{
                    x=rand.nextInt(20);
                }while(x==x0);
		
		if(escolha=='c' && x>x0 ){
			cont++;
			x0=x;
			
		}else if(escolha =='b' && x<x0){
			cont++;
			x0=x;
		}else{
			
			if(escolha=='c' && x<x0 ){
			    System.out.println("Perdeu!! O n�mero " + x + " � menor que " + x0 + " Acertou :  " +cont + " vezes.");	
			   break;
			    }
			else if(escolha=='b' && x>x0 ){
				System.out.println("Perdeu!! O n�mero " + x + " � maior que " + x0 + " Acertou :  " +cont + " vezes.");	
				break;
				}
		}
		}
		System.out.println(cont); 
		}
		
	}
