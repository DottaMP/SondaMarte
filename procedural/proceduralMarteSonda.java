package testeDeProgramaçãoElo7;

import java.util.*;
public class proceduralMarteSonda {
	
	private static Scanner ler;

	public static void main(String[] args)
	{
		ler = new Scanner(System.in);
		
		//Declaração das variáveis
		int a, l, x1 , y1, x2, y2;
		String opcao, direcao1, direcao2;
		
		
		System.out.print("Informe o tamanho do terreno - Altura: ");
		a = ler.nextInt();
		//Solicitado para que o usuário informe o tamanho do terreno.
		System.out.print("Informe o tamanho do terreno - Largura: ");
		l = ler.nextInt();
		
		//1ª Sonda
		System.out.println("Informe a localização da 1ª Sonda: ");
		//Solicitado para que o usuário informe a localicação inicial da 1ª Sonda, devendo informar as posições de x, y e direção cardeal.
		System.out.print("Informe a localização de x: ");
		x1 = ler.nextInt();
		System.out.print("Informe a localização de y: ");
		y1 = ler.nextInt();
		System.out.print("Informe a posição N, S, E ou W: ");
		direcao1 = ler.next().toUpperCase(); //O método '.toUpperCase()'converte toda a String para caixa alta.

		System.out.println("Escolha os comandos para a sonda realizar: ");
		//Solicita ao usuário para informar os movimentos que a sonda irá realizar,
		//As entradas aceitas serão: 'L' para girar a sonda para esquerda, 'R' para girar para direita, 'M' para andar e 'S' para sair.
		System.out.println("[L] - Para girar para esquerda: ");
		System.out.println("[R] - Para girar para direita: "); 
		System.out.println("[M] - Para mover para frente mantendo a mesma direção: ");
		System.out.println("[S] - Parar: ");
		System.out.println("Digite o comando desejado: ");
		
		do{ //O usuário irá informar os movimentos enquanto a entrada for != 'S'.
			
			opcao = ler.next().toUpperCase(); //O método '.toUpperCase()'converte toda a String para caixa alta.
			
			switch (opcao){
			
			case "L"://Caso a entrada for igual a 'L' será realizado a lógica abaixo:
				if (direcao1.equals("N")){
				//Se a direção cardeal atual for igual a N, será alterado para a direção W.
					direcao1 = "W";
					
				}else if (direcao1.equals("E")){
				//Senão se a direção cardeal atual for igual a E, será alterado para a direção N.
					direcao1 = "N";
					
				}else if (direcao1.equals("S")){
				//Senão se a direção cardeal atual for igual a S, será alterado para a direção E.
					direcao1 = "E";
					
				}else if (direcao1.equals("W")){
				//Senão se a direção cardeal atual for igual a W, será alterado para a direção S.
					direcao1 = "S";
				}
				break;
			
			case "R": //Caso a entrada for igual a 'R' será realizado a lógica abaixo:
				if (direcao1.equals("N")){
				//Se a direção cardeal atual for igual a N, será alterado para a direção E.
					direcao1 = "E";
					
				}else if (direcao1.equals("E")){
				//Senão se a direção cardeal atual for igual a E, será alterado para a direção S.
					direcao1 = "S";
					
				}else if (direcao1.equals("S")){
				//Senão se a direção cardeal atual for igual a S, será alterado para a direção W.
					direcao1 = "W";
				}else if (direcao1.equals("W")){
				//Senão se a direção cardeal atual for igual a W, será alterado para a direção N.
					direcao1 = "N";
				}
				break;
			
			case "M": //Caso a entrada for igual a 'M' será realizado a lógica abaixo:
				// Caso as posições x ou y forem menor do que l ou a, não será possível realizar o movimento, pois estará fora da área permitida.
				if (direcao1.equals("N") && y1 < l){
				//Se a direção cardeal atual for igual a N e a posição de y for menor do que l, y irá andar para frente.
					y1 = y1 + 1;
					
				}else if (direcao1.equals("S") && y1 < l){
				//Senão se a direção cardeal atual for igual a S e a posição de y for menor do que l, y irá andar para trás.
					y1 = y1 - 1;
					
				}else if (direcao1.equals("E") && x1 < a){
				//Senão se a direção cardeal atual for igual a E e a posição de x for menor do que a, x irá andar para frente.
					x1 = x1 + 1;
				}else if (direcao1.equals("W") && x1 < a){
				//Senão se a direção cardeal atual for igual a W e a posição de x for menor do que a, x irá andar para trás.
					x1 = x1 - 1;
					
				}else {
				//Senão o movimento não será computado, pois entende-se que estará fora do terreno.
					System.out.println("Fora da área permitida!"); //Movimento não computado.
				}
				break;
			
			case "S": //Caso a entrada for igual a 'S' será interrompido os movimentos.
				System.out.println("\n\n");
				break;
				
			default: //Caso a entrada seja diferente das permitidas irá aparecer a mensagem abaixo.
				System.out.println("Você digitou uma opção inválida!");
			}		
		}while(!opcao.equals("S"));
		
		//2ª Sonda
		System.out.println("Informe a localização da 2ª Sonda: ");
		//Solicitado para que o usuário informe a localicação inicial da 2ª Sonda, devendo informar as posições de x, y e direção cardeal.
		System.out.print("Informe a localização de x: ");
		x2 = ler.nextInt();
		System.out.print("Informe a localização de y: ");
		y2 = ler.nextInt();
		System.out.print("Informe a posição N, S, E ou W: ");
		direcao2 = ler.next().toUpperCase(); //O método '.toUpperCase()'converte toda a String para caixa alta.

		System.out.println("Escolha os comandos para a sonda realizar: ");
		//Solicita ao usuário para informar os movimentos que a sonda irá realizar,
		//As entradas aceitas serão: 'L' para girar a sonda para esquerda, 'R' para girar para direita, 'M' para andar e 'S' para sair.
		System.out.println("[L] - Para virar para esquerda: ");
		System.out.println("[R] - Para virar para direita: "); 
		System.out.println("[M] - Para mover para frente mantendo a mesma direção: ");
		System.out.println("[S] - Parar: ");
		System.out.println("Digite o comando desejado: ");
		
		do{ //O usuário irá informar os movimentos enquanto a entrada for != 'S' ou outro dado diferente do solicitado.
			
			opcao = ler.next().toUpperCase(); //O método '.toUpperCase()'converte toda a String para caixa alta.
			
			switch (opcao){
			
			case "L"://Caso a entrada for igual a 'L' será realizado a lógica abaixo:
				if (direcao1.equals("N")){
				//Se a direção cardeal atual for igual a N, será alterado para a direção W.
					direcao1 = "W";
					
				}else if (direcao1.equals("E")){
				//Senão se a direção cardeal atual for igual a E, será alterado para a direção N.
					direcao1 = "N";
					
				}else if (direcao1.equals("S")){
				//Senão se a direção cardeal atual for igual a S, será alterado para a direção E.
					direcao1 = "E";
					
				}else if (direcao1.equals("W")){
				//Senão se a direção cardeal atual for igual a W, será alterado para a direção S.
					direcao1 = "S";
				}
				break;
			
			case "R": //Caso a entrada for igual a 'R' será realizado a lógica abaixo:
				if (direcao1.equals("N")){
				//Se a direção cardeal atual for igual a N, será alterado para a direção E.
					direcao1 = "E";
					
				}else if (direcao1.equals("E")){
				//Senão se a direção cardeal atual for igual a E, será alterado para a direção S.
					direcao1 = "S";
					
				}else if (direcao1.equals("S")){
				//Senão se a direção cardeal atual for igual a S, será alterado para a direção W.
					direcao1 = "W";
				}else if (direcao1.equals("W")){
				//Senão se a direção cardeal atual for igual a W, será alterado para a direção N.
					direcao1 = "N";
				}
				break;
			
			case "M": //Caso a entrada for igual a 'M' será realizado a lógica abaixo:
				// Caso as posições x ou y forem menor do que l ou a, não será possível realizar o movimento, pois estará fora da área permitida.
				if (direcao1.equals("N") && y1 < l){
				//Se a direção cardeal atual for igual a N e a posição de y for menor do que l, y irá andar para frente.
					y1 = y1 + 1;
					
				}else if (direcao1.equals("S") && y1 < l){
				//Senão se a direção cardeal atual for igual a S e a posição de y for menor do que l, y irá andar para trás.
					y1 = y1 - 1;
					
				}else if (direcao1.equals("E") && x1 < a){
				//Senão se a direção cardeal atual for igual a E e a posição de x for menor do que a, x irá andar para frente.
					x1 = x1 + 1;
				}else if (direcao1.equals("W") && x1 < a){
				//Senão se a direção cardeal atual for igual a W e a posição de x for menor do que a, x irá andar para trás.
					x1 = x1 - 1;
					
				}else {
				//Senão o movimento não será computado, pois entende-se que estará fora do terreno.
					System.out.println("Fora da área permitida!"); //Movimento não computado.
				}
				break;
			
			case "S": //Caso a entrada for igual a 'S' será interrompido os movimentos.
				System.out.println("\n\n");
				break;
				
			default: //Caso a entrada seja diferente das permitidas irá aparecer a mensagem abaixo.
				System.out.println("Você digitou uma opção inválida!");
			}		
		}while(!opcao.equals("S"));
		
		// Será apresentado a posição final das duas sondas, pegando a informação de 'x', 'y', 'direcao'.
		System.out.printf("\nPosição final:\n	1ª Sonda: %d %d %s\n	2ª Sonda: %d %d %s", x1, y1, direcao1, x2, y2, direcao2);

	}
}
