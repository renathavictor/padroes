package view;

import controller.PontuacaoController;
import model.Espiao;
import model.Exercito;
import model.Guerrilheiro;
import model.Inimigo;

public class Main {

	public static void main(String[] args) {

		PontuacaoController controller = new PontuacaoController();
		
		// criacao personagens
		Inimigo espiao = new Espiao();
		Inimigo guerrilheiro = new Guerrilheiro();
		Inimigo exercito = new Exercito();
		
		
		// batalhas
		System.out.println(controller.batalha(espiao));
		System.out.println(controller.batalha(guerrilheiro));
		System.out.println(controller.batalha(exercito));

	}

}
