Estrutura das pastas do meu projeto

**src/

|-- br/

|   -- com/

|       -- calculator/

|           |-- MinhaClasse.java

|           |-- Main.java**



* br.com.calculator: Pacote que contém as classes Java do projeto.

### Compilação e Execução:

* Compilação:
    * Navegue até o diretório src no terminal:

    **cd caminho/para/UniJAVA/src**


* Compile os arquivos .java utilizando o comando javac:

    * **javac br/com/calculator/*.java**

    * Isso criará os arquivos .class necessários.

### Execução:

* Execute o programa utilizando o comando java:

    * **java br.com.calculator.Main**

    * Isso executará o programa e mostrará a saída no console.

### Resultado Esperado:

* **A soma de 5 e 7 é: 12
10 é um número par.**


## Explicação do Código:

* *MinhaClasse.java*: Contém a implementação dos métodos **calcularSoma** e **verificarPar**.

* *Main.java*: Classe principal para testar os métodos da *MinhaClasse*.


### Observações:

* Certifique-se de ter o *Java Development Kit (JDK)* instalado no seu sistema.
Os comandos **javac** e java devem ser executados no diretório que contém o diretório **src**.

* Garanta que a estrutura de pacotes seja respeitada durante a compilação e execução.

* Ao seguir essas instruções, você deve conseguir compilar e executar o programa com sucesso.
