package sondaMarte;

public class sondaMarte {
	
	public static void main(String[] args){
		instrucoesSonda sonda1 = new instrucoesSonda(); 
		//Instanciando um novo objeto (sonda1 e sonda2) a partir da classe instrucoesSonda.
		instrucoesSonda sonda2 = new instrucoesSonda();
		
		sonda1.terreno();
		//Tamanho Terreno = 5, 5
		sonda1.posicaoSonda();
		//Posição sonda1 = 1, 2, N
		sonda1.mover();
		//Movimentos sonda1 = LMLMLMLMM

		sonda2.terreno();
		//Tamanho Terreno = 5, 5
		sonda2.posicaoSonda();
		//Posição sonda2 = 3, 3, E
		sonda2.mover();
		////Movimentos sonda2 = MMRMMRMRRM
		
		System.out.print("\nPosição Final 1ª Sonda: "); // 1, 3, N
		sonda1.status();
		System.out.print("Posição Final 2ª Sonda: "); // 5, 1, E
		sonda2.status();
	}
}
