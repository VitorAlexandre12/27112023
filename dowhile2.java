package algoritmo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dowhile2 {
    public static void main(String[] args) {
        List<String> usersLogged = new ArrayList<>();
        String[] usuariosLogados = {"teste1","teste2","..."};
        usuariosLogados[3] = "teste4";
        usuariosLogados[2] = "Substituir a string ...";

        List<String> usersLogged = new ArrayList<>();
        int limitUsers = 2;
        Scanner scUser = new Scanner(System.in);
        while (usersLogged.size() < limitUsers) {
            System.out.println("Digite o usuario");
            usuario = scUser.nextLine();
            if (usuario != "") {
                usersLogged.add(usuario);
            }else {
                System.out.println("Digite um usuario valido.");
            }
             Thread.sleep(1000);
        }
    
        System.out.println("Limite de usuario atingido.");    
    } catch (InterruptedException e) {
        System.out.println("Ops! Houve algum erro .....");
    }
    
}
