package teste_final;

import java.util.*;

public class Ex_4 {
	
        Scanner in=new Scanner(System.in);
		int opt;
		
	public Ex_4() {
		
/*Numa partida de futebol contra o Canelas, o Clube dos Passarinhos quis utilizar o computador que tem na bilheteira para contar quantos sócios envergam a camisola oficial do clube; deste modo, aquando a venda de um bilhete, o funcionário deve apontar apenas:

‘c’ se o sócio utilizar a camisola oficial do clube;
‘n’ se o sócio utilizar roupa normal;
Quando o funcionário carregar ‘s’ o programa sai e mostra as seguintes informações:
Quantas pessoas compraram ingresso;
Quanto dinheiro foi angariado com a venda de camisolas;
Quanto dinheiro foi angariado com a venda de bilhetes;
O valor de cada bilhete é de 7.5€; cada camisola oficial é vendida por 14€.*/
		
							
			int soma_camisolas=0, soma_bilhetes=0;
			char op;
		
			System.out.println("Registo de vendas ");
		do{
			
			System.out.println("Escolha a opção:\nc - Camisola Clube + Bilhete. \nn - Bilhete.\ns - Consulta \nz - Sair: ");
		    op = in.next().charAt(0);
		    
		    if(op !='s' && op !='n' && op !='c' && op !='z'){
		    	do{
		    		
				System.out.println(" Essa escolha não é válida. Escolha c se maior ou b se menor. " );
				op = in.next().charAt(0);
				
			}while(op !='s' && op !='n' && op !='c' && op !='z');}
		    
		    soma_camisolas+=op=='c'? 1:0;
		    soma_bilhetes+=op=='s'?1:0;
		    
		    if(op=='s'){
		    	System.out.println("Foram angariados  " + (soma_camisolas*14) + " euros em camisolas.");
		    	System.out.println("Foi vendido um total de "+(soma_bilhetes+soma_camisolas) +" bilhetes, que geraram "  + ((soma_bilhetes+soma_camisolas)*7.5) + " euros em receitas.");
		    	System.out.println("\nDeseja continuar o registo de vendas?(s/n)");
		    	char opt = in.next().charAt(0);
		    	if(opt=='s'){
		    		continue;
		    	}else{
		    		break;
		    	}
		    }		    
		    		    
		}while(op!='z');
		
	}

}
