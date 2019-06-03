import java.util.Scanner;
public class Primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int numero=in.nextInt();
        double numeroDouble=numero;
        if ((numeroDouble/numeroDouble)==(numero/numero)){
            if(numeroDouble/2!=numero/2 || numero==2){
                System.out.println("Este numero é primo!");
            } else {
                System.out.println("Este numero não é primo!");
            }
        } else {
            System.out.println("Numero não é primo!");
        }
		
	}

}
