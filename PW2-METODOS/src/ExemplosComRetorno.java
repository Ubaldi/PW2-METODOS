
//public class ExemplosComRetorno {
	//public static void concatenar(String nome, String sobrenome) {
		//System.out.println(nome + " " + sobrenome);}
	//public static void main(String[] args) {
		//concatenar("Rog�rio","Morais");}}

public class ExemplosComRetorno {
	public static String concatenar(String nome, String sobrenome) {
		return nome + " " + sobrenome;
		}
	public static int tamanhoNomeCompleto(String nome,String sobrenome) {
		String nomeCompleto = concatenar(nome,sobrenome);
			return nomeCompleto.length();
	}
	public static void main(String[] args) {
		String nome = concatenar("Arthur","Ubaldi");
		int tamanho = tamanhoNomeCompleto("Arthur","Ubaldi");
		System.out.println("nome: " + nome);
		System.out.println("Qtde: " + tamanho + " caracteres");
	}
}
		 
		