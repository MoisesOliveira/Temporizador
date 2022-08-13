package view;

import controller.OperacoesController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OperacoesController op = new OperacoesController();
		
		
		String frase1000 = op.concatena(1000);
		String frase10000 = op.concatena(10000);
		String frase100000 = op.concatena(10000);
		
		String[] vetor1000 = op.divideFrase(frase1000);
		String[] vetor10000 = op.divideFrase(frase10000);
		String[] vetor100000 = op.divideFrase(frase10000);
		
		op.percorreVetor(vetor1000);
		op.percorreVetor(vetor10000);
		op.percorreVetor(vetor100000);
	}

}
