
import java.util.Random;
import java.util.Scanner;

public class ExemploWhile {
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();

            int segredo = rand.nextInt(1,1000);
            int palpite = 0;
        
            while (palpite != segredo){
                System.out.println("Tente adivinhar o número sorteado:");
                palpite = sc.nextInt();
            }

            System.out.println("Parabéns! Voce acertou!");
            sc.close();
        }
}