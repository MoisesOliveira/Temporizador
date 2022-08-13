package controller;

public class OperacoesController {

	public OperacoesController() {
		// TODO Auto-generated constructor stub
	}

	public String concatena(int posicoes) {
		String frase = "";
		
		for(int i = 0; i < posicoes; i++) {
			frase = frase + "a";
		}
		return frase;
	}
	
	public String[] divideFrase(String frase) {
		String[] vetor = frase.split("");
		
		return vetor;
	}
	
	public void percorreVetor(String[] vetor) {
		long tempoInicial = System.nanoTime();
		
		for(String palavra : vetor) {
		}
		long tempoFinal = System.nanoTime();
		
		long tempoTotal = tempoFinal - tempoInicial;
		
		System.out.println("Tempo gasto para " + vetor.length + " posicões : " + tempoTotal + " nS");
		
	}
}
