package sondaMarte;

import java.util.Scanner;

public class instrucoesSonda {
	//Atributos
	String direcao;
	String movimento;
	String statusFinal;
	String opcao;
	int x, y, a, l;
	Scanner ler = new Scanner(System.in); //Criado o objeto ler do tipo Scanner, responsável pela leitura das entradas de dados.

	//Métodos Públicos Pesonalizados
	public void terreno(){ 
		/*O método terreno, solicita ao usuário para informar o tamanho do terreno, 
		devendo o mesmo entrar com o valor de x e y.*/
		
		//Utilizando vetor para atribuir os valores digitados pelo usuário nas variáveis 'a' e 'l'.
		System.out.print("Informe o tamanho do terreno: ");
		String entrada = ler.nextLine(); // x y
		String[] vetor = entrada.split(" ");
		this.a = Integer.valueOf(vetor[0]); // valor de x (altura)
		this.l = Integer.valueOf(vetor[1]); // valor de y (largura)
		
		/*for melhorado, para imprimir o valor que contém no vetor, separando os mesmos por um espaço.
		for(String n : vetor) {
			System.out.print(n + " ");
		}*/
		
		/*Utilizando o método para o usuário informar um por vez dos dados.
		System.out.println("Informe o tamanho da área do terreno:");
		System.out.print("Informe o tamanho de x: ");
		this.a = ler.nextInt();
		System.out.print("Informe o tamanho de y: ");
		this.l = ler.nextInt();*/
		
		/*Ou pode-se deixar fixo o tamanho do terreno, atribuindo o valor direto em 'a' e 'l'.
		this.a = 5;
		this.l = 5;*/
	}
	
	public void posicaoSonda(){
		/*O método posição Sonda, solicita ao usuário para informar a posição inicial da Sonda, 
		devendo o mesmo entrar com o valor de x, y e da direção cardeal.*/

		System.out.print("\nInforme a posição da Sonda e a direção cardeal: ");
		String entrada = ler.nextLine().toUpperCase(); // x y N - *O métodoo '.toUpperCase()'converte toda a String para caixa alta.
		
		String[] vetor = entrada.split(" ");
		this.x = Integer.valueOf(vetor[0]); // valor de x 
		this.y = Integer.valueOf(vetor[1]); // valor de y
		this.direcao = vetor[2]; // valor direção cardeal
		
		/*for melhorado, para imprimir o valor que contém no vetor, separando os mesmos por um espaço.
		for(String n : vetor) {
			System.out.print(n + " ");
		}*/
		
		/*Utilizando o método para o usuário informar um por vez dos dados.
		System.out.println("Informe a posição da Sonda:");
		System.out.print("Entre com a posição de x: ");
		this.x = ler.nextInt();
		System.out.print("Entre com a posição de y: ");
		this.y = ler.nextInt();
		System.out.print("Entre com a direção cardeal: ");
		this.direcao = ler.next().toUpperCase(); //O métodoo '.toUpperCase()'converte toda a String para caixa alta.*/
	}
	
	public void mover(){
		//O método mover, solicita ao usuário para informar os movimentos que a sonda irá realizar,
		//As entradas aceitas serão: 'L' para girar a sonda para esquerda, 'R' para girar para direita, 'M' para andar parfa frente e 'S' para sair.
		System.out.println("\nEscolha os comandos para a sonda realizar: ");
		System.out.println("[L] - Para girar para esquerda: ");
		System.out.println("[R] - Para girar para direita: "); 
		System.out.println("[M] - Para mover para frente mantendo a mesma direção: ");
		System.out.println("[S] - Parar: "); 
		System.out.println("Digite o comando desejado: ");
		
		
		do{	//O usuário irá informar os movimentos enquanto a entrada for != 'S'.
				
			this.opcao = ler.next().toUpperCase(); //O métodoo '.toUpperCase()'converte toda a String para caixa alta.

				switch (this.opcao){
				case "L": //Caso a entrada for igual a 'L' será realizado a lógica abaixo:
					if (this.direcao.equals("N")){ 
					//Se a direção cardeal atual for igual a N, será alterado para a direção W.
						this.direcao = "W";
						
					}else if (this.direcao.equals("E")){
					//Senão se a direção cardeal atual for igual a E, será alterado para a direção N.
						this.direcao = "N";
						
					}else if (this.direcao.equals("S")){
					//Senão se a direção cardeal atual for igual a S, será alterado para a direção E.
						this.direcao = "E";
						
					}else if (this.direcao.equals("W")){
					//Senão se a direção cardeal atual for igual a W, será alterado para a direção S.
						this.direcao = "S";
					}
					break;
				
				case "R": //Caso a entrada for igual a 'R' será realizado a lógica abaixo:
					if (this.direcao.equals("N")){
					//Se a direção cardeal atual for igual a N, será alterado para a direção E.
						this.direcao = "E";
						
					}else if (this.direcao.equals("E")){
					//Senão se a direção cardeal atual for igual a E, será alterado para a direção S.
						this.direcao = "S";
						
					}else if (this.direcao.equals("S")){
					//Senão se a direção cardeal atual for igual a S, será alterado para a direção W.
						this.direcao = "W";
					}else if (this.direcao.equals("W")){
					//Senão se a direção cardeal atual for igual a W, será alterado para a direção N.
						this.direcao = "N";
					}
					break;
				
				case "M": //Caso a entrada for igual a 'M' será realizado a lógica abaixo:
					// Caso as posições x ou y forem menor do que l ou a, não será possível realizar o movimento, pois estará fora da área permitida.
					if (this.direcao.equals("N") && this.y < this.l){
					//Se a direção cardeal atual for igual a N e a posição de y for menor do que l, y irá andar para frente.
						this.y = this.y + 1;
					}else if (this.direcao.equals("S") && y < this.l){
					//Senão se a direção cardeal atual for igual a S e a posição de y for menor do que l, y irá andar para trás.
						this.y = this.y - 1;
					}else if (direcao.equals("E") && this.x < this.a){
					//Senão se a direção cardeal atual for igual a E e a posição de x for menor do que a, x irá andar para frente.
						this.x = this.x + 1;
					}else if (direcao.equals("W") && this.x < this.a){
					//Senão se a direção cardeal atual for igual a W e a posição de x for menor do que a, x irá andar para trás.
						this.x = this.x - 1;
					
					}else {
					//Senão o movimento não será computado, pois entende-se que estará fora do terreno.
						System.out.println("Fora da área permitida!"); //Movimento não computado.
					}
					break;
				
				case "S": //Caso a entrada for igual a 'S' será interrompido os movimentos e saíra do laço de repetição.
					break;
					
				default: //Caso a entrada seja diferente das permitidas irá aparecer a mensagem abaixo.
					System.out.println("Você digitou uma opção inválida!");
					break;
				}
			}while(!this.opcao.equals("S"));
	}
	
	public void status(){
		//O método status irá apresentar a posição final da sonda, pegando a informação de 'x', 'y', 'direcao'.
		System.out.print(+this.getX()+" "+this.getY()+" "+this.getDirecao()+"\n");
	}

	//Métodos Getters
	public String getDirecao() {
		//O método get de direção irá retornar o valor de 'direcao'.
		return this.direcao;
	}

	public int getX() {
		//O método get de x irá retornar o valor de 'x'.
		return this.x;
	}

	public int getY() {
		//O método get de y irá retornar o valor de 'y'.
		return this.y;
	}
	
	public int getA() {
		//O método get de a irá retornar o valor de 'a'.
		return this.a;
	}
	
	public int getL() {
		//O método get de l irá retornar o valor de 'l'.
		return this.l;
	}

}
