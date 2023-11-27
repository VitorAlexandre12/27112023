package algoritmo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dowhile3 {
   public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        Scanner scFruta = new Scanner(System.in);
        String fruta;
        boolean sair = false;
        String saida;
        while ( sair == false) {
             System.out.println("Digite o nome de uma fruta: ");
             fruta = scFruta.nextLine();
             if (fruta != "") {
                frutas.add(fruta);
             } else {
                System.out.println("Digite um nome valido");
             }
             System.out.println("Deseja digitar mais algum nome de fruta?");
             System.out.println("Digite S ou s para continuar ou digite N ou n para sair.");
             saida = scSair.nextLine();
             if (saida.equals("N") || saida.equals("n")) {
                break;
             }
        }
        System.out.println("Foram adicionados " + frutas.size() + " frutas, quais sejam: " + frutas);
       

   } 
}
