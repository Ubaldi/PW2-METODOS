//Criar metodo somar() que retorna a soma de dois inteiros
//criar o metodo proximo() que retorna o proximo numero
//criar o metodo dobro() que retorna o dobro do seu numero

public class Exercicio {
	
	public static int soma(int numeroUm, int numeroDois) {
		return numeroUm + numeroDois;
		}
	
	public static int proximo(int resSoma) {
		return resSoma + 1;
	}
	
	public static int dobro(int resProximo) {
		return resProximo + resProximo;
	}
	public static void main(String[] args) {
		int resSoma = soma (3, 2);
		int resProximo = proximo(resSoma);
		int resDobro = dobro(resProximo);
		System.out.println("soma de 3 + 2 � igual a: " + resSoma);
		System.out.println("O proximo n�mero: " + resProximo);
		System.out.println("o dobro do n�mero: " + resDobro);
	}
}
