package vetores;

import java.util.Scanner;

/**
 *
 * @author valter lafuente junior
 */
public class manipulacaoVetores {

    public static int tamanhoVetor() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o tamanho do seu vetor: ");
        int tm = ler.nextInt();
        if (tm > 0 && tm <= 100) {
            return tm;
        } else {
            return -1;
        }

    }
    public satic int []criarVetor(int tm) {
        int []v = new int[tm];
        return v;
    }
    
    public static void populaVetor(int[] vetor) {
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Vetor [" + i + "]:");
            vetor[i] = ler.nextInt();
        }
        System.out.println("-----------------------");
    }

    public static int Maior(int v[], int elementos) {

        int max = 0;
        for (int i = 0; i < elementos; i++) {
            if (v[i] > max) {
                max = v[i];
            }
        }
        return max;
    }

    public static void Inserir(int vetor[], int elementos, int posicao) {
        if (posicao >= 0 && posicao <= elementos) {
            for (int i = elementos - 1; i >= posicao; i--) {
                vetor[i + 1] = vetor[i];
            }
        } else {
            System.out.println("Posicao invalida");
        }
    }

    public static void Remove(int v[], int elementos, int posicao) {

        for (int i = posicao; i < elementos - 1; i++) {
            v[i] = v[i + 1];
        }
    }

    public static void intercalaVetor(int v[], int[] v1, int v2[]) {

        int aux = 0;
        for (int i = 0; i < v.length; i++) {
            v2[aux] = v[i];
            aux += 2;

        }
        aux = 1;
        for (int i = 0; i < v1.length; i++) {
            v2[aux] = v1[i];
            aux += 2;
        }
        System.out.println("----Criando o vetor C com a soma "
                + "do tamanhos de A e B -----");
        for (int i = 0; i < v2.length; i++) {
            System.out.println("vetor[" + i + "]" + v2[i]);
        }
        System.out.println("----Ordem crescente-----");
        int p;
        for (int i = 0; i < v2.length; i++) {
            for (int j = 0; j < v2.length - 1; j++) {
                if (v2[i] < v2[j]) {
                    p = v2[i];
                    v2[i] = v2[j];
                    v2[j] = p;
                }
            }
        }
        for (int i = 0; i < v2.length; i++) {
            System.out.println("vetor[" + i + "]" + v2[i]);
        }
    }

    public static boolean buscar(int v[], int entrada) {

        for (int i = 0; i < v.length; i++) {
            if (v[i] == entrada) {
                return true;
            }
        }
        return false;
    }

    private static void trocar(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    private static int separar(int[] v, int esq, int dir) {
        int i = esq + 1;
        int j = dir;
        int pivo = v[esq];
        while (i <= j) {
            if (v[i] <= pivo) {
                i++;
            } else if (v[j] > pivo) {
                j--;
            } else if (i <= j) {
                trocar(v, i, j);
                i++;
                j--;
            }
        }
        trocar(v, esq, j);
        return j;
    }

    public static void quicksort(int[] v, int esq, int dir) {
        if (esq < dir) {
            int j = separar(v, esq, dir);
            quicksort(v, esq, j - 1);
            quicksort(v, j + 1, dir);
        }
    }

    public static void main(String[] args) {
        
        int tm = tamanhoVetor();
        int tm1 = tamanhoVetor();
        int[] v = new int[tm];
        populaVetor(v);
        int[] v1 = new int[tm1];
        populaVetor(v1);
        int[] v2 = new int[tm + tm1];

        intercalaVetor(v, v1, v2);
        
        System.out.println("------Rearranjo------");
        int tm3 = tamanhoVetor();
        int[] v3 = new int[tm3];
        populaVetor(v3);

        quicksort(v3, 0, v3.length-1);
        for (int i = 0; i < v3.length; i++) {
            System.out.println("Vetor[" + i + "]:" + v3[i]);
    }
  }
}
