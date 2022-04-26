package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura"; //objeto literal
		//String outro = new String("Alura");
		
		String vazio = " Alura ";
		String outroVazio = vazio.trim();
		
		System.out.println(vazio);
		System.out.println(vazio.contains("Alu"));
		System.out.println(outroVazio);
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
		System.out.println(nome.charAt(i));
		}
		
//		int pos = nome.indexOf("ur");
//		System.out.println("pos");
		
//		char c = nome.charAt(0);
//		System.out.println(c);
//		
//		char c = 'A';
//		
//		String outra = nome.replace("A", "a");
//		
		//String outra = nome.toLowerCase();
		
//		System.out.println(nome);
//		System.out.println(outra);
		
	}

}
