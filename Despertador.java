mport java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Digite seu período");
		System.out.println("1 - Matutino");
		System.out.println("2 - Vesperino");
		System.out.println("3 - Noturno");
		

	 Scanner sc1= new Scanner(System.in);
	 	int p;
			 System.out.println("Digite seu período:"); 
			 p = sc1.nextInt();
			 
			 switch (p) {
			 case 1:
			 System.out.println("BOM DIA");
			 break;
			 case 2:
			 System.out.println("BOATARDE"); 
			 break;
			 case 3:
			 System.out.println("BOA NOITE");
			 break;
			 default:
				 System.out.println("INVÁLIDO");
					 
			 
		}
	}
}
