import java.util.Scanner;
public class FatoresPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int numero = sc.nextInt();
		System.out.print(numero + " = ");
		sc.nextLine();
		int numerosPrimos[] = new int[numero];
		numerosPrimos = encontraNumerosPrimos(numero, numerosPrimos);
		decomporEmFatoresPrimos(numero, numerosPrimos);

	}

	// MÉTODOS

	public static int[] encontraNumerosPrimos(int numero, int numerosPrimos[]) {
		int i, j;
		boolean flag = true;

		for (i = numero; i >= 2; i--) {
			for (j = i - 1; j >= 2 && flag == true; j--) {
				if (i % j == 0) {
					flag = false;
				}
			}
			if (flag == true) {
				numerosPrimos[i] = 1;
			}
			flag = true;
		}
		return numerosPrimos;
	}

	public static void decomporEmFatoresPrimos(int numero, int numerosPrimos[]) {
		int resultado = numero, expoente = 0;
		for (int i = 2; i <= numero && resultado > 1; i++) {
			if (numerosPrimos[i] == 1) {
				if (resultado % i == 0) {
					while (resultado % i == 0) {
						resultado /= i;
						expoente++;
					}
					if (expoente > 1) {
						System.out.print(i + "^" + expoente);
					} else {
						System.out.print(i);
					}
					if (resultado > 1)
						System.out.print("  x  ");
					expoente = 0;
				}
			}
		}
	}
}
