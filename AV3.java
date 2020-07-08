package AV3;

import java.util.Scanner;

public class AV3 {

	public static void main(String[] args) {
		float saldo=0, saque, deposito;
		int n;
		
		System.out.println("1- Saldo");
		System.out.println("2- Saque");
		System.out.println("3- Depósito");
		System.out.println("9- Sair");
		
		
		do
		{System.out.println("Digite o número da opção selecionada para executar a ação desejada:");
		Scanner leitor = new Scanner(System.in);
		n = leitor.nextInt();
		if (n==1||n==2||n==3||n==9)	
		    {switch (n)
			{
			case 1:
				System.out.println("Seu saldo atual é:" + saldo);
				break;
			
			case 2:
				System.out.println("Digite o valor do saque: ");
				saque = leitor.nextFloat();
				if (saldo-saque<0)
					System.out.println("Você não tem esse dinheiro para sacar.");
				else 
				saldo += SaldoSaque(saque);
				System.out.println("Seu saldo pós saque é: " + saldo);
				break;
			case 3:
				System.out.println("Digite o valor do depósito: ");
				deposito = leitor.nextFloat();
				saldo += SaldoDepo(deposito);
				System.out.println("Seu saldo pós depósito é: " + saldo);
				break;
				
			case 9:
			    System.out.println("Você saiu da área de operações.");
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