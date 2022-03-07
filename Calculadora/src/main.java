import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuInicial();
		
	}
	
	public static void MenuInicial() {
		
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		do {
			
			System.out.println("#####################");
			System.out.println("# 1 - Soma          #");
			System.out.println("# 2 - Subtra��o     #");
			System.out.println("# 3 - Divis�o       #");
			System.out.println("# 4 - Multiplica��o #");
			System.out.println("# 5 - Sair          #");
			System.out.println("#####################");
			
			System.out.println("Qual a op��o que pretende?");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println(Soma(PedeNumero(), PedeNumero()));
				break;
			case 2:
				System.out.println(Subtracao(PedeNumero(), PedeNumero()));
				break;
			case 3:
				System.out.println(Divisao(PedeNumero(), PedeNumero()));
				break;
			case 4:
				System.out.println(Multiplicacao(PedeNumero(), PedeNumero()));
				break;
			case 5:
				break;
			default:
				System.out.println("Op��o inv�lida");
				break;
		}
		} while (opcao != 5);
		
	}
	
	public static double Soma(double n1, double n2) {
		return n1 + n2;
	}
	
	public static double Subtracao(double n1, double n2) {
		return n1 - n2;
	}
	
	public static double Multiplicacao(double n1, double n2) {
		return n1 * n2;
	}
	
	public static double Divisao(double n1, double n2) {
		return n1 / n2;
	}
	
	public static double PedeNumero() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o numero?");
		return sc.nextDouble();
	}

}
