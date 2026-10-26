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

    public static void exc4(){

    }

    public static void exc23(){
    int numero = 0, qtdPares = 0, qtdImpares = 0, maior = 0, menor = Integer.MAX_VALUE, media = 0, qtdNumeros = 0;

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
        media += numero;
        qtdNumeros++;
        if (qtdNumeros == 0) {
            
        }
    }
    System.out.printf("total de pares = %d%n", qtdPares);
    System.out.printf("Total de impares = %d%n", qtdImpares);
    System.out.printf("Maior numero = %d%n", maior);
    System.out.printf("Menor numero = %d%n", menor);
    media = media / qtdNumeros;
    System.out.printf("Media de numeros = %d%n", media);

    }
}
