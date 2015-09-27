import java.util.Scanner;

public class TicTacToe {

	private static Scanner scanner;

	public static void main(String[] args) {
				
		Spelplan spelplan = new Spelplan();
		spelplan.�terst�ll();

		System.out.println("V�lkommen ange namn spelare 1");
		
		//SPELARE 1 INITIERAS
		scanner = new Scanner(System.in);
		String spelareUno = scanner.nextLine(); 
		Spelare spelare1 = new Spelare(spelareUno, 'X', 1);
		System.out.println(spelare1);

		
		//SPELARE 2 INITIERAS
		System.out.println("Ange ett namn p� spelare nummer 2");
		String spelareDos = scanner.nextLine();
		Spelare spelare2 = new Spelare(spelareDos, 'O', 2);
		System.out.println(spelare2);

		
		//VISA SPELPLAN
		System.out.println(spelplan);
		
		//VARIABLER F�R LOOPEN
		int omg�ng = 0;
		Spelare nuvarandeSpelare;
		boolean fors�ttspela = true;


		// METOD F�R ATT H�LLA SPELET RULLANDE �VER OMG�NGAR 
		while(fors�ttspela){				
			
			
			//IF-SATS F�R ATT V�XLA MELLAN DE TV� SPELARENA
			if(omg�ng % 2 == 0){				
				nuvarandeSpelare = spelare1;							
			} else {
				nuvarandeSpelare = spelare2;
			}
			omg�ng++;
			
			spelplan.fr�gaSpelaren(nuvarandeSpelare.getMark�r());
			System.out.println(spelplan);
			
			if(spelplan.kollaVinnare() == true){
				System.out.println("Grattis! " + nuvarandeSpelare.getNamn() + " har vunnit!");
				fors�ttspela = false;
			}
			
			if(omg�ng == 9){
				System.out.println("Oavgjort!");
				fors�ttspela = false;
			}
			
							
					

			
		}

	}	


}