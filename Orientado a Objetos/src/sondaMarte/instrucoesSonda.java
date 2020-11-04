package sondaMarte;

import java.util.Scanner;

public class instrucoesSonda {
	//Atributos
	String direcao;
	String movimento;
	String statusFinal;
	String opcao;
	int x, y, a, l;
	Scanner ler = new Scanner(System.in); //Criado o objeto ler do tipo Scanner, respons�vel pela leitura das entradas de dados.

	//M�todos P�blicos Pesonalizados
	public void terreno(){ 
		/*O m�todo terreno, solicita ao usu�rio para informar o tamanho do terreno, 
		devendo o mesmo entrar com o valor de x e y.*/
		
		//Utilizando vetor para atribuir os valores digitados pelo usu�rio nas vari�veis 'a' e 'l'.
		System.out.print("Informe o tamanho do terreno: ");
		String entrada = ler.nextLine(); // x y
		String[] vetor = entrada.split(" ");
		this.a = Integer.valueOf(vetor[0]); // valor de x (altura)
		this.l = Integer.valueOf(vetor[1]); // valor de y (largura)
		
		/*for melhorado, para imprimir o valor que cont�m no vetor, separando os mesmos por um espa�o.
		for(String n : vetor) {
			System.out.print(n + " ");
		}*/
		
		/*Utilizando o m�todo para o usu�rio informar um por vez dos dados.
		System.out.println("Informe o tamanho da �rea do terreno:");
		System.out.print("Informe o tamanho de x: ");
		this.a = ler.nextInt();
		System.out.print("Informe o tamanho de y: ");
		this.l = ler.nextInt();*/
		
		/*Ou pode-se deixar fixo o tamanho do terreno, atribuindo o valor direto em 'a' e 'l'.
		this.a = 5;
		this.l = 5;*/
	}
	
	public void posicaoSonda(){
		/*O m�todo posi��o Sonda, solicita ao usu�rio para informar a posi��o inicial da Sonda, 
		devendo o mesmo entrar com o valor de x, y e da dire��o cardial.*/

		System.out.print("\nInforme a posi��o da Sonda e a dire��o cardial: ");
		String entrada = ler.nextLine().toUpperCase(); // x y N - *O m�todoo '.toUpperCase()'converte toda a String para caixa alta.
		
		String[] vetor = entrada.split(" ");
		this.x = Integer.valueOf(vetor[0]); // valor de x 
		this.y = Integer.valueOf(vetor[1]); // valor de y
		this.direcao = vetor[2]; // valor dire��o cardial
		
		/*for melhorado, para imprimir o valor que cont�m no vetor, separando os mesmos por um espa�o.
		for(String n : vetor) {
			System.out.print(n + " ");
		}*/
		
		/*Utilizando o m�todo para o usu�rio informar um por vez dos dados.
		System.out.println("Informe a posi��o da Sonda:");
		System.out.print("Entre com a posi��o de x: ");
		this.x = ler.nextInt();
		System.out.print("Entre com a posi��o de y: ");
		this.y = ler.nextInt();
		System.out.print("Entre com a dire��o cardial: ");
		this.direcao = ler.next().toUpperCase(); //O m�todoo '.toUpperCase()'converte toda a String para caixa alta.*/
	}
	
	public void mover(){
		//O m�todo mover, solicita ao usu�rio para informar os movimentos que a sonda ir� realizar,
		//As entradas aceitas ser�o: 'L' para girar a sonda para esquerda, 'R' para girar para direita, 'M' para andar parfa frente e 'S' para sair.
		System.out.println("\nEscolha os comandos para a sonda realizar: ");
		System.out.println("[L] - Para girar para esquerda: ");
		System.out.println("[R] - Para girar para direita: "); 
		System.out.println("[M] - Para mover para frente mantendo a mesma dire��o: ");
		System.out.println("[S] - Parar: "); 
		System.out.println("Digite o comando desejado: ");
		
		
		do{	//O usu�rio ir� informar os movimentos enquanto a entrada for != 'S'.
				
			this.opcao = ler.next().toUpperCase(); //O m�todoo '.toUpperCase()'converte toda a String para caixa alta.

				switch (this.opcao){
				case "L": //Caso a entrada for igual a 'L' ser� realizado a l�gica abaixo:
					if (this.direcao.equals("N")){ 
					//Se a dire��o cardial atual for igual a N, ser� alterado para a dire��o W.
						this.direcao = "W";
						
					}else if (this.direcao.equals("E")){
					//Sen�o se a dire��o cardial atual for igual a E, ser� alterado para a dire��o N.
						this.direcao = "N";
						
					}else if (this.direcao.equals("S")){
					//Sen�o se a dire��o cardial atual for igual a S, ser� alterado para a dire��o E.
						this.direcao = "E";
						
					}else if (this.direcao.equals("W")){
					//Sen�o se a dire��o cardial atual for igual a W, ser� alterado para a dire��o S.
						this.direcao = "S";
					}
					break;
				
				case "R": //Caso a entrada for igual a 'R' ser� realizado a l�gica abaixo:
					if (this.direcao.equals("N")){
					//Se a dire��o cardial atual for igual a N, ser� alterado para a dire��o E.
						this.direcao = "E";
						
					}else if (this.direcao.equals("E")){
					//Sen�o se a dire��o cardial atual for igual a E, ser� alterado para a dire��o S.
						this.direcao = "S";
						
					}else if (this.direcao.equals("S")){
					//Sen�o se a dire��o cardial atual for igual a S, ser� alterado para a dire��o W.
						this.direcao = "W";
					}else if (this.direcao.equals("W")){
					//Sen�o se a dire��o cardial atual for igual a W, ser� alterado para a dire��o N.
						this.direcao = "N";
					}
					break;
				
				case "M": //Caso a entrada for igual a 'M' ser� realizado a l�gica abaixo:
					// Caso as posi��es x ou y forem menor do que l ou a, n�o ser� poss�vel realizar o movimento, pois estar� fora da �rea permitida.
					if (this.direcao.equals("N") && this.y < this.l){
					//Se a dire��o cardial atual for igual a N e a posi��o de y for menor do que l, y ir� andar para frente.
						this.y = this.y + 1;
					}else if (this.direcao.equals("S") && y < this.l){
					//Sen�o se a dire��o cardial atual for igual a S e a posi��o de y for menor do que l, y ir� andar para tr�s.
						this.y = this.y - 1;
					}else if (direcao.equals("E") && this.x < this.a){
					//Sen�o se a dire��o cardial atual for igual a E e a posi��o de x for menor do que a, x ir� andar para frente.
						this.x = this.x + 1;
					}else if (direcao.equals("W") && this.x < this.a){
					//Sen�o se a dire��o cardial atual for igual a W e a posi��o de x for menor do que a, x ir� andar para tr�s.
						this.x = this.x - 1;
					
					}else {
					//Sen�o o movimento n�o ser� computado, pois entende-se que estar� fora do terreno.
						System.out.println("Fora da �rea permitida!"); //Movimento n�o computado.
					}
					break;
				
				case "S": //Caso a entrada for igual a 'S' ser� interrompido os movimentos.
					break;
					
				default: //Caso a entrada seja diferente das permitidas ir� aparecer a mensagem abaixo.
					System.out.println("Voc� digitou uma op��o inv�lida!");
					break;
				}
			}while(!this.opcao.equals("S"));
	}
	
	public void status(){
		//O m�todo status ir� apresentar a posi��o final da sonda, pegando a informa��o de 'x', 'y', 'direcao'.
		System.out.print(+this.getX()+" "+this.getY()+" "+this.getDirecao()+"\n");
	}

	//M�todos Getters
	public String getDirecao() {
		//O m�todo get de dire��o ir� retornar o valor de 'direcao'.
		return this.direcao;
	}

	public int getX() {
		//O m�todo get de x ir� retornar o valor de 'x'.
		return this.x;
	}

	public int getY() {
		//O m�todo get de y ir� retornar o valor de 'y'.
		return this.y;
	}
	
	public int getA() {
		//O m�todo get de a ir� retornar o valor de 'a'.
		return this.a;
	}
	
	public int getL() {
		//O m�todo get de l ir� retornar o valor de 'l'.
		return this.l;
	}

}