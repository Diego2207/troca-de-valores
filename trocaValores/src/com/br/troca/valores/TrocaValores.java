package com.br.troca.valores;

import java.util.Scanner;

public class TrocaValores {

	public static void main(String[] args) {
		
Scanner entrada =  new  Scanner ( System.in);
		
		System.out.println( " digite o primeiro número: " );
		int  A  = entrada.nextInt ();
		
		System.out.println( " digite o segundo número: " );
		int  B  = entrada.nextInt ();
		
		A  =  A  +  B ;
		B  =  A  -  B ;
		A  =  A  -  B ;
		
		System.out.println( " o valor de A é "  +  A  + " , e o valor de B é "  +  B );

	}

}
