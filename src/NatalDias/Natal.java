package NatalDias;

public class Natal {
	
	private int dia;	
	private int mes;	
	private int ano;
	
	public Natal (int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
		public int getDiasRestantesnatal() {
			
			int[] qtdDias = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
			
			if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)))
				qtdDias[1]++;				

			if (mes == 12 && dia <= 25) {
				return 25 - dia;
				}else {									
				
				int diasRest = qtdDias[mes-1] - dia + 1;

				
				for (int i = mes + 1; i <= 12; i++)
					diasRest += qtdDias[i-1];	
					
				return diasRest;				
			}
		}
		
	}

