import java.util.Scanner;

public class TamanhoMoldura {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float baseMaior;
		float baseMenor;
		float alturaMaior;
		float alturaMenor;
		
		//entrada de valores
		System.out.print("Digite o valor da bases maior: ");
		baseMaior = entrada.nextFloat();
		System.out.print("Digite o valor da alturas maior: ");
		alturaMaior = entrada.nextFloat();
		System.out.print("Digite o valor da base menor: ");
		baseMenor = entrada.nextFloat();
		System.out.print("Digite o valor da altura menor: ");
		alturaMenor = entrada.nextFloat();
		
		
		//operações
		Retangulo molduraGrande = new Retangulo(baseMaior, alturaMaior);
		Retangulo molduraPequena = new Retangulo(baseMenor, alturaMenor);
		CalcMoldura moldura = new CalcMoldura(molduraPequena, molduraGrande );
		System.out.println("A area da moldura é: " + moldura.calcularMoldura());
	}

}
