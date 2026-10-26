import java.util.Random;
import java.util.Scanner;

public class ListaTres {
    static Scanner Ler = new Scanner(System.in);

    public static void main(String[] args){
        exc2();
    }

    //Peça ao usuário para digitar c.aracteres um a um. Quando ele digitar um ponto final (.),
    // pare a leitura e informe quantos caracteres possui.

    public static void ex1() {
        //variavel para o caractere digitado
        char caractere;
        //variavel para contar
        int contador = 0;
        do{
            System.out.println("Digite um caractere");
            caractere = Ler.next().charAt(0);
            contador++;
        } while (caractere != '.');
        System.out.printf("Foram digitados %d caracteres",--contador);
    }

    //as divas do ADS,somos as mais mais. greve dos onibus 

    public static void exc2(){
        String palavra;
        int vogais = 0;
        System.out.println("Digite uma palavra");
        palavra = Ler.next().toLowerCase();
        for(int i = 0; i < palavra.length();i++);
        Object i = null;
                char letra = palavra.charAt((int) i);
        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            vogais++;
        }
        System.out.printf("%s tem %d vogais", palavra,vogais);
    }

    //Peça uma palavra e um numero n. Mostre a plavra repetida n vezes, uma em cada linha.
    public static void exc3(){
        String palavra;
        int n;
        System.out.println("Digite uma palavra");
        palavra = Ler.nextLine();
        System.out.println("Digite um numero");
        n = Integer.parseInt(Ler.nextLine());
        for (int i = 0; i < n; i++){
            System.out.println(palavra);
        }
    }

    //Leia frases do usuario em loop. Quando ele digitar "sair", o programa termina.
    public static void exc4(){
        String frase;
        do{
            System.out.println("Digite uma frase(sair para terminar)");
            frase = Ler.nextLine();
            if (!frase.equalsIgnoreCase("sair")) {
                System.out.println("Voce digitou: " + frase);
            }
        } while (!frase.equalsIgnoreCase("sair"));
    }

    //Continue pedindo para o usuário digitar um nome até que ele digite algo com pelo menos 3 letras.
    public static void exc5(){
        String nome;
        do{
            System.out.println("Digite um nome (minimo 3 letras)");
            nome = Ler.nextLine();
        } while (nome.length() < 3);
        System.out.println("Nome valido: " + nome);
    }

    //Solicite uma senha e peça confirmação até que ambas coincidam.
    public static void exc6(){
        String senha, confirmacao;
        do{
            System.out.println("Digite uma senha");
            senha = Ler.nextLine();
            System.out.println("Confirme a senha");
            confirmacao = Ler.nextLine();
            if (!senha.equals(confirmacao)) {
                System.out.println("Senhas nao conferem, tente novamente");
            }
        } while (!senha.equals(confirmacao));
        System.out.println("Senha confirmada com sucesso!");
    }

    //Numero fixo oculto. O usuario tem até 5 tentivas para adivinhar.
    public static void exc7(){
        int secreto = 7;
        int palpite;
        int tentativas = 0;
        boolean acertou = false;
        do{
            System.out.println("Adivinhe o numero (tentativa" + (tentativas + 1) + " de 5)");
            palpite = Integer.parseInt(Ler.nextLine());
            tentativas++;
            if (palpite == secreto) {
                acertou = true;
                break;
            }
        }while (!acertou && tentativas < 5);
        if (acertou) {
            System.out.printf("Acertou em %d tentativas", tentativas);
        }else {
            System.out.printf("Acabaram as tentativas. O numero era %d", secreto);
        } 

    }

    //Permita votar em três candidatos até que a palavra "fim" seja digitada. Mostre o total de votos de cada candidato.
    public static void exc8(){
        int votos1 = 0, votos2 = 0, votos3 = 0;
        String voto;
        do{
            System.out.println("Vote em 1, 2 ou 3 (fim para encerrar)");
            voto = Ler.nextLine();
            if (voto.equals("1")) {
                votos1++;
            }else if (voto.equals("2")) {
                votos2++;
            }else if (voto.equals("3")) {
                votos3++;
            }else if (!voto.equalsIgnoreCase("fim")) {
                System.out.println("Voto invalido");
            }
        }while (!voto.equalsIgnoreCase("fim"));
        System.out.printf("Candidato 1: %d votos%n", votos1);
        System.out.printf("Candidato 2: %d votos%n", votos2);
        System.out.printf("Candidato 3: %d votos%n", votos3);
    }

    //Simule um caixa eletrônico que permite vários saques até o saldo acabar ou o usuário sair.
    public static void exc9(){
        double saldo = 1000;
        double saque;
        do{
            System.out.printf("Saldo: R$ %.2f%n", saldo);
            System.out.println("Digite o valor do saque (0 para sair)");
            saque = Double.parseDouble(Ler.nextLine());
            if (saque > saldo) {
                System.out.println("Saldo insuficiente");
            }else if (saque > 0) {
                saldo = saldo - saque;
                System.out.println("Saque realizado");
            }
        }while (saque != 0 && saldo > 0);
        System.out.printf("Saldo final: R$ %.2f%n", saldo);
    }

    //Faça uma pergunta (ex: "Qual é a capital do Brasil?") até que o usuário acerte
    public static void exc10(){
        String resposta;
        do{
            System.out.println("Qual é a capital do Brasil?");
            resposta = Ler.nextLine();
            if (!resposta.equalsIgnoreCase("brasilia") && !resposta.equalsIgnoreCase("brasília.")) {
                System.out.println("Errou, tente novamente");
            }
        }while (!resposta.equalsIgnoreCase("brasilia") && !resposta.equalsIgnoreCase("brasília."));
        System.out.println("Parabéns! Você acertou.");
    }

    //Peça CPF até que seja digitado corretamente 11 digitos.
    public static void exc11(){
        String cpf;
        boolean valido;
        do{
            System.out.println("Digite um CPF (11 digitos)");
            cpf = Ler.nextLine();
            valido = cpf.length() == 11;
            for (int i = 0; i < cpf.length(); i++) {
                if (!Character.isDigit(cpf.charAt(i))) {
                    valido = false;
                }
            }
            if (!valido) {
                System.out.println("CPF invalido, tente novamente");
            }
        }while (!valido);
        System.out.println("CPF aceito: " + cpf);
        
    }

    //Faça 5 perguntas em sequência. Conte quantas foram respondidas corretamente.
    public static void exc12(){
        String[] perguntas = {
            "Quanto é 2 + 2?",
            "Qual é a capital da França?",
            "Quantos dias tem uma semana?",
            "Qual é o maior planeta do sistema solar?",
            "Quantas letras tem o alfabeto?"
        };
        String[] respostas = {
            "4",
            "Paris",
            "7",
            "Júpiter",
            "26"
        };
        int acertos = 0;
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            String resposta = Ler.nextLine();
            if (resposta.equalsIgnoreCase(respostas[i])) {
                acertos++;
            }
        }
        System.out.printf("Você acertou %d de 5", acertos);
    }

    //Peça uma letra e um numero n. Mostre n vezes essa letra em uma mesma linha.
    public static void exc13(){
        char letra;
        int n;
        System.out.println("Digite uma letra");
        letra = Ler.nextLine().charAt(0);
        System.out.println("Digite um numero");
        n = Integer.parseInt(Ler.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print(letra);
        }
        
    }

    //Simule o lançamento de um dado 10 vezes, mostrando os resultados.
    public static void exc14(){
        Random sorteio = new Random();
        for(int i = 1 ; i <= 10; i++){
            int dado = sorteio.nextInt(6) + 1;
            System.out.printf("Lançamento %d: %d%n", i, dado);
        }

    }

    //Mostre um menu com 3 opções. Repita até o usuário escolher "sair".
    public static void exc15(){
        String opcao;
        do{
            System.out.println("1 - Opcao A");
            System.out.println("2 - Opcao B");
            System.out.println("3 - Opcao C");
            System.out.println("Sair");
            opcao = Ler.nextLine();
            if (opcao.equals("1")) {
                System.out.println("Voce escolheu a opcao A");
            }else if (opcao.equals("2")) {
                System.out.println("Voce escolheu a opcao B");
            }else if (opcao.equals("3")) {
                System.out.println("Voce escolheu a opcao C");
            }else if (!opcao.equalsIgnoreCase("sair")) {
                System.out.println("Opcao invalida");
            }
        }while (!opcao.equalsIgnoreCase("sair"));
    }

    //Peça letras uma a uma até que o usuário digite a letra "x". Conte quantas vezes digitou vogais.
    public static void exc16(){
        char letra;
        int vogais = 0;
        do{
            System.out.println("Digite uma letra (x para parar)");
            letra = Ler.nextLine().toLowerCase().charAt(0);
            if (letra == 'a' || letra == 'e' || letra =='i' || letra == 'o' || letra == 'u'){
                vogais++;
            }
        }while (letra != 'x');
        System.out.printf("Foram digitadas %d vogais", vogais);
    }

    //Permita cadastro de nome e preço de produtos até que "fim" seja digitado. Calcule o total geral
    public static void ec17(){
        String nome;
        double preço;
        double total = 0;
        do{System.out.println("Digite o nome do produto(fim para encerrar)");
            nome = Ler.nextLine();
            if (!nome.equalsIgnoreCase("fim")) {
                System.out.println("Digite o preço do produto");
                preço = Double.parseDouble(Ler.nextLine());
                total = total + preço;
            }
        }while (!nome.equalsIgnoreCase("fim"));
        System.out.printf("Total geral: R$ %.2f%n", total);
    }

    //Peça uma frase e conte quantas palavras ela tem (com base nos espaços).
    public static void exc18(){
         String frase;
         int palavras = 0;
         System.out.println("Digite uma frase");
         frase = Ler.nextLine().trim();
         if(frase.length() > 0){
            palavras = 1;
            for( int i = 1; i < frase.length(); i++){
                //conta quando um espaço é seguido de uma letra
                if (frase.charAt(i - 1) == ' ' && frase.charAt(i) != ' ') {
                    palavras++;
                }
            }
         }
            System.out.printf("A frase tem %d palavras", palavras);
    }

    //Repetir senha até ter maiúscula, número e mínimo 8 caracteres.
    public static void exc19(){
        String senha;
        boolean maiuscula, numero;
        do{
            maiuscula = false;
            numero = false;
            System.out.println("Digite a senha (1 maiuscula, 1 numero, minimo 8 caracteres)");
            senha = Ler.nextLine();
            for (int i = 0; i < senha.length(); i++) {
                char letra = senha.charAt(i);
                if (Character.isUpperCase(letra)) {
                    maiuscula = true;
                }
                if (Character.isDigit(letra)) {
                    numero = true;
                }
            }
             if (!maiuscula && !numero && senha.length() >= 8) {
            System.out.println("Senha invalida, tente novamente");
            }
        }while (!(maiuscula && numero && senha.length() >= 8));
        System.out.println("Senha valida");
       
    }

    //Peça uma palavra e um caractere. Conte quantas vezes o caractere aparece na palavra.
    public static void exc20(){
        String palavra;
        char caractere;
        int contador = 0;
        System.out.println("Digite uma palavra");
        palavra = Ler.nextLine();
        System.out.println("Digite um caractere");
        caractere = Ler.nextLine().charAt(0);
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == caractere) {
                contador++;
            }
        }
        System.out.printf("O caractere '%c' aparece %d vez(es)", caractere, contador);

    }


    //Peça um numero entre 1 e 100. Repita enquanto estiver fora do intervalo.
    public static void exc21(){
        int numero;
        do{
            System.out.println("Digite um numero entre 1 e 100");
            numero = Integer.parseInt(Ler.nextLine());
        }while (numero < 1 || numero > 100);
        System.out.printf("Numero aceito: %d", numero);
    }

    //Peça uma String e some os digitos presentes (ex: "a2c4" -> 6)
    public static void exc22(){
        String texto;
        int soma = 0;
        System.out.println("Digite uma string");
        texto = Ler.nextLine();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isDigit(c)) {
                soma = soma + Character.getNumericValue(c);
            }
        }
        System.out.printf("A soma dos dígitos é: %d", soma);
    }

    //Peça um numero digitado de um numero inteiro até que seja digitado um numero negativo.
    //ao digitar um valor negativo, deverão ser exibidos a média dos numeros digitados,
    // o menor numero, o maoir numero, quantidade de numeros pares e quantidades de numeros impares.
    public static void exc23(){
    int numero = 0, qtdPares = 0, qtdImpares = 0, maior = 0, menor = Integer.MAX_VALUE, soma = 0, media = 0, qtdNumeros = 0;

    while(numero >=0) {
        System.out.println("Digite um numero");
        numero = Ler.nextInt();
        if (numero <= 0) {
            break;
        }
        if (numero % 2 == 0) {
            qtdPares++;
        }else{
            qtdImpares++;
        }
        if (numero > maior) {
            maior = numero;
        }
        if (numero < menor) {
            menor = numero;
        }
        
        soma += numero;
        qtdNumeros++;
    }
    if (qtdNumeros >0){
        System.out.printf("Nenhum numero valido foi digitado");
        return;
    }
    double media1 = (double) soma / qtdNumeros;
    System.out.printf("Total de pares = %d%n", qtdPares);
    System.out.printf("Total de impares = %d%n", qtdImpares);
    System.out.printf("Maior numero = %d%n", maior);
    System.out.printf("Menor numero = %d%n", menor);
    System.out.printf("Media = %.2f%n", media1);

    }

}
// teste de atualização
    
