package testeDePrograma��oElo7;

import java.util.*;
public class proceduralMarteSonda {
	
	private static Scanner ler;

	public static void main(String[] args)
	{
		ler = new Scanner(System.in);
		
		//Declara��o das vari�veis
		int a, l, x1 , y1, x2, y2;
		String opcao, direcao1, direcao2;
		
		
		System.out.print("Informe o tamanho do terreno - Altura: ");
		a = ler.nextInt();
		//Solicitado para que o usu�rio informe o tamanho do terreno.
		System.out.print("Informe o tamanho do terreno - Largura: ");
		l = ler.nextInt();
		
		//1� Sonda
		System.out.println("Informe a localiza��o da 1� Sonda: ");
		//Solicitado para que o usu�rio informe s localica��o inicial da 1� Sonda, devendo informar as posi��es de x, y e dire��o cardial.
		System.out.print("Informe a localiza��o de x: ");
		x1 = ler.nextInt();
		System.out.print("Informe a localiza��o de y: ");
		y1 = ler.nextInt();
		System.out.print("Informe a posi��o N, S, E ou W: ");
		direcao1 = ler.next().toUpperCase(); //O m�todo '.toUpperCase()'converte toda a String para caixa alta.

		System.out.println("Escolha os comandos para a sonda realizar: ");
		//Solicita ao usu�rio para informar os movimentos que a sonda ir� realizar,
		//As entradas aceitas ser�o: 'L' para girar a sonda para esquerda, 'R' para girar para direita, 'M' para andar parfa frente e 'S' para sair.
		System.out.println("[L] - Para girar para esquerda: ");
		System.out.println("[R] - Para girar para direita: "); 
		System.out.println("[M] - Para mover para frente mantendo a mesma dire��o: ");
		System.out.println("[S] - Parar: ");
		System.out.println("Digite o comando desejado: ");
		
		do{ //O usu�rio ir� informar os movimentos enquanto a entrada for != 'S' ou outro dado diferente do solicitado.
			
			opcao = ler.next().toUpperCase(); //O m�todo '.toUpperCase()'converte toda a String para caixa alta.
			
			switch (opcao){
			
			case "L"://Caso a entrada for igual a 'L' ser� realizado a l�gica abaixo:
				if (direcao1.equals("N")){
				//Se a dire��o cardial atual for igual a N, ser� alterado para a dire��o W.
					direcao1 = "W";
					
				}else if (direcao1.equals("E")){
				//Sen�o se a dire��o cardial atual for igual a E, ser� alterado para a dire��o N.
					direcao1 = "N";
					
				}else if (direcao1.equals("S")){
				//Sen�o se a dire��o cardial atual for igual a S, ser� alterado para a dire��o E.
					direcao1 = "E";
					
				}else if (direcao1.equals("W")){
				//Sen�o se a dire��o cardial atual for igual a W, ser� alterado para a dire��o S.
					direcao1 = "S";
				}
				break;
			
			case "R": //Caso a entrada for igual a 'R' ser� realizado a l�gica abaixo:
				if (direcao1.equals("N")){
				//Se a dire��o cardial atual for igual a N, ser� alterado para a dire��o E.
					direcao1 = "E";
					
				}else if (direcao1.equals("E")){
				//Sen�o se a dire��o cardial atual for igual a E, ser� alterado para a dire��o S.
					direcao1 = "S";
					
				}else if (direcao1.equals("S")){
				//Sen�o se a dire��o cardial atual for igual a S, ser� alterado para a dire��o W.
					direcao1 = "W";
				}else if (direcao1.equals("W")){
				//Sen�o se a dire��o cardial atual for igual a W, ser� alterado para a dire��o N.
					direcao1 = "N";
				}
				break;
			
			case "M": //Caso a entrada for igual a 'M' ser� realizado a l�gica abaixo:
				// Caso as posi��es x ou y forem menor do que l ou a, n�o ser� poss�vel realizar o movimento, pois estar� fora da �rea permitida.
				if (direcao1.equals("N") && y1 < l){
				//Se a dire��o cardial atual for igual a N e a posi��o de y for menor do que l, y ir� andar para frente.
					y1 = y1 + 1;
					
				}else if (direcao1.equals("S") && y1 < l){
				//Sen�o se a dire��o cardial atual for igual a S e a posi��o de y for menor do que l, y ir� andar para tr�s.
					y1 = y1 - 1;
					
				}else if (direcao1.equals("E") && x1 < a){
				//Sen�o se a dire��o cardial atual for igual a E e a posi��o de x for menor do que a, x ir� andar para frente.
					x1 = x1 + 1;
				}else if (direcao1.equals("W") && x1 < a){
				//Sen�o se a dire��o cardial atual for igual a W e a posi��o de x for menor do que a, x ir� andar para tr�s.
					x1 = x1 - 1;
					
				}else {
				//Sen�o o movimento n�o ser� computado, pois entende-se que estar� fora do terreno.
					System.out.println("Fora da �rea permitida!"); //Movimento n�o computado.
				}
				break;
			
			case "S": //Caso a entrada for igual a 'S' ser� interrompido os movimentos.
				System.out.println("\n\n");
				break;
				
			default: //Caso a entrada seja diferente das permitidas ir� aparecer a mensagem abaixo.
				System.out.println("Voc� digitou uma op��o inv�lida!");
			}		
		}while(opcao.equals("L") || opcao.equals("M") || opcao.equals("R"));
		
		//2� Sonda
		System.out.println("Informe a localiza��o da 2� Sonda: ");
		//Solicitado para que o usu�rio informe s localica��o inicial da 2� Sonda, devendo informar as posi��es de x, y e dire��o cardial.
		System.out.print("Informe a localiza��o de x: ");
		x2 = ler.nextInt();
		System.out.print("Informe a localiza��o de y: ");
		y2 = ler.nextInt();
		System.out.print("Informe a posi��o N, S, E ou W: ");
		direcao2 = ler.next().toUpperCase(); //O m�todo '.toUpperCase()'converte toda a String para caixa alta.

		System.out.println("Escolha os comandos para a sonda realizar: ");
		//Solicita ao usu�rio para informar os movimentos que a sonda ir� realizar,
		//As entradas aceitas ser�o: 'L' para girar a sonda para esquerda, 'R' para girar para direita, 'M' para andar parfa frente e 'S' para sair.
		System.out.println("[L] - Para virar para esquerda: ");
		System.out.println("[R] - Para virar para direita: "); 
		System.out.println("[M] - Para mover para frente mantendo a mesma dire��o: ");
		System.out.println("[S] - Parar: ");
		System.out.println("Digite o comando desejado: ");
		
		do{ //O usu�rio ir� informar os movimentos enquanto a entrada for != 'S' ou outro dado diferente do solicitado.
			
			opcao = ler.next().toUpperCase(); //O m�todo '.toUpperCase()'converte toda a String para caixa alta.
			
			switch (opcao){
			
			case "L"://Caso a entrada for igual a 'L' ser� realizado a l�gica abaixo:
				if (direcao1.equals("N")){
				//Se a dire��o cardial atual for igual a N, ser� alterado para a dire��o W.
					direcao1 = "W";
					
				}else if (direcao1.equals("E")){
				//Sen�o se a dire��o cardial atual for igual a E, ser� alterado para a dire��o N.
					direcao1 = "N";
					
				}else if (direcao1.equals("S")){
				//Sen�o se a dire��o cardial atual for igual a S, ser� alterado para a dire��o E.
					direcao1 = "E";
					
				}else if (direcao1.equals("W")){
				//Sen�o se a dire��o cardial atual for igual a W, ser� alterado para a dire��o S.
					direcao1 = "S";
				}
				break;
			
			case "R": //Caso a entrada for igual a 'R' ser� realizado a l�gica abaixo:
				if (direcao1.equals("N")){
				//Se a dire��o cardial atual for igual a N, ser� alterado para a dire��o E.
					direcao1 = "E";
					
				}else if (direcao1.equals("E")){
				//Sen�o se a dire��o cardial atual for igual a E, ser� alterado para a dire��o S.
					direcao1 = "S";
					
				}else if (direcao1.equals("S")){
				//Sen�o se a dire��o cardial atual for igual a S, ser� alterado para a dire��o W.
					direcao1 = "W";
				}else if (direcao1.equals("W")){
				//Sen�o se a dire��o cardial atual for igual a W, ser� alterado para a dire��o N.
					direcao1 = "N";
				}
				break;
			
			case "M": //Caso a entrada for igual a 'M' ser� realizado a l�gica abaixo:
				// Caso as posi��es x ou y forem menor do que l ou a, n�o ser� poss�vel realizar o movimento, pois estar� fora da �rea permitida.
				if (direcao1.equals("N") && y1 < l){
				//Se a dire��o cardial atual for igual a N e a posi��o de y for menor do que l, y ir� andar para frente.
					y1 = y1 + 1;
					
				}else if (direcao1.equals("S") && y1 < l){
				//Sen�o se a dire��o cardial atual for igual a S e a posi��o de y for menor do que l, y ir� andar para tr�s.
					y1 = y1 - 1;
					
				}else if (direcao1.equals("E") && x1 < a){
				//Sen�o se a dire��o cardial atual for igual a E e a posi��o de x for menor do que a, x ir� andar para frente.
					x1 = x1 + 1;
				}else if (direcao1.equals("W") && x1 < a){
				//Sen�o se a dire��o cardial atual for igual a W e a posi��o de x for menor do que a, x ir� andar para tr�s.
					x1 = x1 - 1;
					
				}else {
				//Sen�o o movimento n�o ser� computado, pois entende-se que estar� fora do terreno.
					System.out.println("Fora da �rea permitida!"); //Movimento n�o computado.
				}
				break;
			
			case "S": //Caso a entrada for igual a 'S' ser� interrompido os movimentos.
				System.out.println("\n\n");
				break;
				
			default: //Caso a entrada seja diferente das permitidas ir� aparecer a mensagem abaixo.
				System.out.println("Voc� digitou uma op��o inv�lida!");
			}		
		}while(opcao.equals("L") || opcao.equals("M") || opcao.equals("R"));
		
		// Ser� apresentado a posi��o final das duas sondas, pegando a informa��o de 'x', 'y', 'direcao'.
		System.out.printf("\nPosi��o final:\n	1� Sonda: %d %d %s\n	2� Sonda: %d %d %s", x1, y1, direcao1, x2, y2, direcao2);

	}
}
