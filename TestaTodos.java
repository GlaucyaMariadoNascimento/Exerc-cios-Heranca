package br.com.generation.heranca;

public class TestaTodos {
	
	public static void main(String[] args) {
		
		Cachorro cr = new Cachorro();
		
		cr.setNome("Bartonomeu");
		cr.setIdade(2);
		cr.setEmitirSom("Latindo");
		cr.setMovimento("Correndo");
		
		System.out.println("Nome: " + cr.getNome());
		System.out.println("Idade: " + cr.getIdade());
		System.out.println("Som: " + cr.getEmitirSom());
		System.out.println("Movimentos: " + cr.getMovimento());
		System.out.println();
		
		Cavalo cv = new Cavalo();
		
		cv.setNome("Pampa");
		cv.setIdade(8);
		cv.setEmitirSom("Relinchando");
		cv.setMovimento("Correndo");
		
		System.out.println("Nome: " + cv.getNome());
		System.out.println("Idade: " + cv.getIdade());
		System.out.println("Som: " + cv.getEmitirSom());
		System.out.println("Movimentos: " + cv.getMovimento());
		System.out.println();
		
		
		Preguiça pr = new Preguiça();
		
		pr.setNome("Baby");
		pr.setIdade(4);
		pr.setEmitirSom("ahh ahh ahhh");
		pr.setMovimento("Subindo na árvore");
		
		System.out.println("Nome: " + pr.getNome());
		System.out.println("Idade: " + pr.getIdade());
		System.out.println("Som: " + pr.getEmitirSom());
		System.out.println("Movimentos: " + pr.getMovimento());
		System.out.println();
		
		
		
	}

}
