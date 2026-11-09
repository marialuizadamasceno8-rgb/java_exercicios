import java.util.Random;

public class exercicioArray5 {
    public static void main(String[] args) {
        Random rand = new Random();
        double [] [] notas = new double [8] [4];
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Digite a nota %d do aluno %d%n", (j +1 ), (i + 1));
                notas[i][j] = rand.nextDouble(0, 10);
            }
        }
    }
}

    // for para exibir as notas e médias
    for(int i= 0; i < notas.length; i++){
        System.out.printf("Aluno %d", (i+1));
        double media = 0;
        //for para passar pelas notas do aluno
        for (intj = 0; j < notas[i].length; j++){
            media += notas[i][j];
            System.out.printf("|%4.1f%", notas[i][j]);
        }
        media /= notas[i].length;

        System.out.printf( "%4.1f%n", media);
        
    }