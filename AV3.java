package AV3;

import java.util.Scanner;

public class AV3 {

	public static void main(String[] args) {
		float saldo=0, saque, deposito;
		int n;
		
		System.out.println("1- Saldo");
		System.out.println("2- Saque");
		System.out.println("3- Dep�sito");
		System.out.println("9- Sair");
		
		
		do
		{System.out.println("Digite o n�mero da op��o selecionada para executar a a��o desejada:");
		Scanner leitor = new Scanner(System.in);
		n = leitor.nextInt();
		if (n==1||n==2||n==3||n==9)	
		    {switch (n)
			{
			case 1:
				System.out.println("Seu saldo atual �:" + saldo);
				break;
			
			case 2:
				System.out.println("Digite o valor do saque: ");
				saque = leitor.nextFloat();
				if (saldo-saque<0)
					System.out.println("Voc� n�o tem esse dinheiro para sacar.");
				else 
				saldo += SaldoSaque(saque);
				System.out.println("Seu saldo p�s saque �: " + saldo);
				break;
			case 3:
				System.out.println("Digite o valor do dep�sito: ");
				deposito = leitor.nextFloat();
				saldo += SaldoDepo(deposito);
				System.out.println("Seu saldo p�s dep�sito �: " + saldo);
				break;
				
			case 9:
			    System.out.println("Voc� saiu da �rea de opera��es.");
			}
		    }
			
		    else
		    {System.out.println("Erro!");}
			
		}
		while (n!=9);
		
		
		}

	public static float SaldoSaque(float saque)
	{
			float saldo=0;
			saldo -= saque;
			return (saldo);
			
		
	}

	public static float SaldoDepo(float deposito)
	{
		float saldo=0;	
		saldo+=deposito;
		return(saldo);
		
	}








}