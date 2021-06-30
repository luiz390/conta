package regulamento;

import java.util.Scanner;

public class TestaFuncionario {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome = "LUIZ HENRIQUE";
		int conta=456329;
		double saldo  = 1500;
		double saque,novosaldo;
		double depositar;
		int x;
	
	
		
		System.out.println("***********************************");
		System.out.println("*********BANCO DA SOGRA************");
		System.out.println("***********************************");
		System.out.println();
		System.out.println("ESCOLHA A OPERAÇÃO");
		System.out.println("1 = SALDO");
	    System.out.println("2 = DEPOSITAR");
	    System.out.println("3 = SAQUE");
	    x = sc.nextInt();     
	    System.out.println();
	    switch (x) {
	        
	    case 1:
	    	System.out.println("SALDO : "+saldo);
	    break;
	    
	    case 2:
	    	System.out.println("DIGITE O VALOR DO DEPÓSITO");
	    	depositar = sc.nextDouble();
	    	novosaldo = saldo+depositar;
	    	System.out.println("CONTA DE :"+ nome);
	    	System.out.println("NUMERO DA CONTA: "+conta);
	    	System.out.println("O NOVO SALDO É : "+ novosaldo);
	    	break;
	    	
	    case 3:
	    	System.out.println("DIGITE O VALOR DO SAQUE");
	    	saque = sc.nextDouble();
	    	if(saque > saldo) {
	    		System.out.println("SALDO INSULFICIENTE");
	    	}
	    	else {
	    	 	novosaldo = saque - saldo;
		    	System.out.println("CONTA DE :"+ nome);
		    	System.out.println("NUMERO DA CONTA: "+conta);
		    	System.out.println("O NOVO SALDO É : "+ novosaldo);
		    	break;
	    		
	    	}
	    	
	   
	   
	    
	    }
			

	}

}
