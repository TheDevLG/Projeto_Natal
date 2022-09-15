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
			//iniciando laço para a exceção
			do {
				try {
					System.out.print("Digite o Mes *1-12*:\n ");
					mes = scanner.nextInt();
					//condicionamento da exceção
					if(mes < 1 || mes > 12)
						throw new Exception("Mês inválido");
					//caso não haja exceção, a variável booleana se tornará true permitindo que não caia no loop
					sinal = true;
				}catch(Exception e) {
					System.out.println("Mês inválido");
					//limpeza de buffer
					scanner.nextLine();
				}
			}while(sinal == false);
			// tornando a variável booleana em false novamente para que seja usada posteriormente
			sinal = false;
			//int mesDia = mes;
			//laço para exceção
			do {
				try {
					System.out.print("Digite o Dia *1-31*:\n ");
			 		dia = scanner.nextInt();
			 		//condicionamento da exceção
			 		if(dia < 1 || dia > qtdDias[mes - 1]) {
			 		throw new Exception("Dia inválido!");
			 		}
			 	sinal = true;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					scanner.nextLine();
			 	}
			} while(sinal == false);
			//criando um objeto da classe Natal
			natal = new Natal(dia, mes, ano);
			//utilizando o método da classe natal
			System.out.println("Dias restantes para o Natal: " + natal.getDiasRestantesnatal());			
		
			scanner.close();
		}
}


