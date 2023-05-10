package pontoEletronico;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App{
    public static void main(String[] args) {
        
        //cria novo usuario
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o nome do usuário:");
        String nome = teclado.next();
        System.out.println("Digite o CPF: ");
        String CPF = teclado.next();
        Usuario novo = new Usuario(nome,CPF);
        System.out.printf("Bem vindo!\n%s - CPF %s\n",novo.getNomeUser(), novo.getCpfUser()); 

        //salva os horario de entrada
        System.out.println("Registrar horário de entrada? (s/n)");
        String resp = teclado.next();
        if (resp.equals("s")){
            novo.setUserHoraEntrada();
        }

        //salva os horario de saída
         System.out.println("Registrar horário de saída? (s/n)");
        resp = teclado.next();
        if (resp.equals("s")){
            novo.setUserHoraSaida();
        }

        // exibe a saida
        System.out.printf("Registro Realizado para %s\nHorário de Entrada: %s\nHorário de Saída: %s",novo.getNomeUser(),novo.getUserHoraEntrada(),novo.getUserHoraSaida());

        teclado.close();
        

        
    }



}
