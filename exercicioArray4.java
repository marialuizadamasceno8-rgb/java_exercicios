package metodoRepetição;

public class exercicioArray4 {
    public static void main(String[] args) {

        //Criar com valores pre definido, se vc ja souber os valores do array, é só abrir uma chave com os valores
        int [] numeros = {8, 7, 6, 4, 98, 32, 55, 78, 66, 99};
        numeros [0] = 40;
        String [] dias =
        {
            "segunda",
            "terça",
            "quarta",
            "quinta",
            "sexta",
            "sábado",
            "domingo"
        };
        String [] nomes {"Ana", "Carlos", "Edna", "Fernando", "Gabriel", "joão", "Matheus"};

    }
        System.out.println(maior(numeros));
        System.out.println(menor(numeros));
        System.out.println(qtdPares(numeros));
        System.out.println(qtdImpares(numeros));
        System.out.println(procurar(nomes, "Ana"));
        System.out.println(procurar(dias, "sexta-feira"));
   
}

        public static int buscar (String [] array, String texto){
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(texto)) {
                    return i;
                }
            }
            return -1;
        }

      public static boolean procurar (String [] array, String texto){
        for (String s : array) {
            if (s.equals(texto)) {
                return true;
            }
        }
    }


    public static int qtdImpares(int [] array) {
        return array.length - qtdPares(array);
    }
    
  
    public static int qtdPares(int [] array) {
        int qtd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                qtd++;
            }
        }
        return qtd;
    }

    public static int menor (int [] array) {
        int menor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }

    public static int maior (int [] array) {
        int maior = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }
