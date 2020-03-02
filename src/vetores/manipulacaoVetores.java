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
       for (int i = 0; i < v2.length ; i++) {
            for (int j = 0 ; j < v2.length-1 ; j++) {
                if(v2[i] < v2[j]){
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
    public static void rearranja(int []v){
          int p;
       for (int i = 0; i < v.length ; i++) {
            for (int j = 0 ; j < v.length-1 ; j++) {
                if(v[i] < v[j]){
                 p = v[i];
                 v[i] = v[j];
                 v[j] = p; 
                }  
            }    
        }
        for (int i = 0; i < v.length; i++) {
        System.out.println("vetor[" + i + "]" + v[i]);
      }
    }
    public static void main(String[] args) {
        /*
        int tm = tamanhoVetor();
        int tm1 = tamanhoVetor();
        int[] v = new int[tm];
        populaVetor(v);
        int[] v1 = new int[tm1];
        populaVetor(v1);
        int[] v2 = new int[tm + tm1];

        intercalaVetor(v, v1, v2);*/
        
        int tm = tamanhoVetor();
        int[] v2 = new int[tm];
        populaVetor(v2);
        
        rearranja(v2);
    }
   }

