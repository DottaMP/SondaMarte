# Explorando Marte :rocket:

<br>

**Teste de Programação Elo7**    
[Repositório Teste](https://gist.github.com/elo7-developer/1a40c96a5d062b69f02c "Clique Aqui")

## Objetivo
Criar um programa que processe uma série de instruções enviadas para as sondas que estão explorando Marte.
O planalto é divido numa malha para simplificar a navegação. 
Para controlar as sondas, a NASA envia uma simples sequência de letras. As letras possíveis são "L", "R" e "M". Destas, "L" e "R" fazem a sonda virar 90 graus para a esquerda ou direita, respectivamente, sem mover a sonda. "M" faz com que a sonda mova-se para a frente um ponto da malha, mantendo a mesma direção.
Forma de *entrada* e *saída* é livre.

### Pensando na Solução :bulb:
Foi realizado primeiro um programa simples de forma [procedural](https://github.com/DottaMP/SondaMarte/tree/main/procedural "Clique Aqui"), pensando como prioridade a lógica que seria utilizada para que a saída ocorresse conforme o esperado.    
Após chegar na lógica esperada, foi pensando na aplicação feita através de métodos utilizando a [orientação a objetos](https://github.com/DottaMP/SondaMarte/tree/main/Orientado%20a%20Objetos/src/sondaMarte "Clique Aqui"), onde foi construído o main [sondaMarte](https://github.com/DottaMP/SondaMarte/blob/main/Orientado%20a%20Objetos/src/sondaMarte/sondaMarte.java "Clique Aqui"),responsável por chamar os métodos da classe [instrucoesSonda](https://github.com/DottaMP/SondaMarte/blob/main/Orientado%20a%20Objetos/src/sondaMarte/instrucoesSonda.java "Clique Aqui").

### Entrada
Incluído a Letra *'S'* para parar os comandos.    
A entrada de dados foi construída para que fosse solicitado ao usuário as informações, tamanho do terreno, localização inicial da sonda e comandos realizados por essa.    

| Entrada dos Dados |  
|------|
|Informe o tamanho do terreno: 5 5|
||
|Informe a posição da Sonda e a direção cardeal: 1 2 N|
||
|Escolha os comandos para a sonda realizar:| 
|[L] - Para girar para esquerda: |
|[R] - Para girar para direita: |
|[M] - Para mover para frente mantendo a mesma direção: |
|[S] - Parar: |
|Digite o comando desejado: |
|L|
|M|
|L|
|M|
|L|
|M|
|L|
|M|
|M|
|S|
|Informe o tamanho do terreno: 5 5|
||
|Informe a posição da Sonda e a direção cardeal: 3 3 E|
||
|Escolha os comandos para a sonda realizar:| 
|[L] - Para girar para esquerda: |
|[R] - Para girar para direita: |
|[M] - Para mover para frente mantendo a mesma direção: |
|[S] - Parar: |
|Digite o comando desejado: |
|M|
|M|
|R|
|M|
|M|
|M|
|Fora da área permitida!|
|R|
|R|
|M|
|Fora da área permitida!|
|S| 
 
## Saída
Na saída, é apresentado a localização final das sondas, mostrando as posições de x, y e direção cardeal, respectivamente.
| Saída dos Dados | 
|------|
|Posição Final 1ª Sonda: 1 3 N|
|Posição Final 2ª Sonda: 5 1 E|
