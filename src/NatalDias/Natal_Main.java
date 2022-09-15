package NatalDias;

import java.util.Scanner;

public class Natal_Main {
	
	

		public static void main(String[] args) throws Exception {
			
			int dia = 0, mes = 0, ano = 0;
			Natal natal;		
			Scanner scanner = new Scanner(System.in);			
			int[] qtdDias = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			boolean sinal = false;
			
			do {
				try {
					System.out.print("Digite o Ano *0 - 2022*:\n");
					ano = scanner.nextInt();
					if(ano < 0 || ano > 2022) {
						throw new Exception("insira um ano entre 0 e 2022");
					}sinal = true;
				}catch(Exception e) {
					System.out.println(e.getMessage());
					scanner.nextLine();
				}
			} while(sinal == false);
			
			sinal = false;
			//iniciando la�o para a exce��o
			do {
				try {
					System.out.print("Digite o Mes *1-12*:\n ");
					mes = scanner.nextInt();
					//condicionamento da exce��o
					if(mes < 1 || mes > 12)
						throw new Exception("M�s inv�lido");
					//caso n�o haja exce��o, a vari�vel booleana se tornar� true permitindo que n�o caia no loop
					sinal = true;
				}catch(Exception e) {
					System.out.println("M�s inv�lido");
					//limpeza de buffer
					scanner.nextLine();
				}
			}while(sinal == false);
			// tornando a vari�vel booleana em false novamente para que seja usada posteriormente
			sinal = false;
			//int mesDia = mes;
			//la�o para exce��o
			do {
				try {
					System.out.print("Digite o Dia *1-31*:\n ");
			 		dia = scanner.nextInt();
			 		//condicionamento da exce��o
			 		if(dia < 1 || dia > qtdDias[mes - 1]) {
			 		throw new Exception("Dia inv�lido!");
			 		}
			 	sinal = true;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					scanner.nextLine();
			 	}
			} while(sinal == false);
			//criando um objeto da classe Natal
			natal = new Natal(dia, mes, ano);
			//utilizando o m�todo da classe natal
			System.out.println("Dias restantes para o Natal: " + natal.getDiasRestantesnatal());			
		
			scanner.close();
		}
}


