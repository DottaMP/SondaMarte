package sondaMarte;

public class sondaMarte {
	
	public static void main(String[] args){
		instrucoesSonda sonda1 = new instrucoesSonda(); 
		//Instanciando um novo objeto (sonda1 e sonda2) a partir da classe instrucoesSonda.
		instrucoesSonda sonda2 = new instrucoesSonda();
		
		sonda1.terreno();
		//Tamanho Terreno = 5, 5
		System.out.println();
		sonda1.posicaoSonda();
		//Posi��o sonda1 = 1, 2, N
		System.out.println();
		sonda1.mover();
		//Movimentos sonda1 = LMLMLMLMM
		System.out.println();

		sonda2.terreno();
		//Tamanho Terreno = 5, 5
		System.out.println();
		sonda2.posicaoSonda();
		//Posi��o sonda2 = 3, 3, E
		System.out.println();
		sonda2.mover();
		////Movimentos sonda2 = MMRMMRMRRM
		
		System.out.print("Posi��o Final 1� Sonda: ");
		sonda1.status();
		System.out.print("Posi��o Final 2� Sonda: ");
		sonda2.status();

	}

}
