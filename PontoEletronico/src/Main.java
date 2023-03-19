import java.util.Date;
import java.util.Scanner;

import javax.xml.namespace.QName;

import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       Usuario novo1 = new Usuario();

       novo1.nome = "junior";

       System.out.println(novo1.nome);

       SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		Date data = new Date();
		System.out.println("Data não formatada");
		System.out.println(data);
		System.out.println("Data formatada");
		System.out.println(format.format(data));
        
        
        System.out.println("deseja registrar a hora de entrada? (s/n)");
        String resp = teclado.next();

        if (resp.equals("s")){
            
            Date data1 = new Date();
            novo1.horaEntrada = format.format(data1);
            System.out.println(novo1.horaEntrada);
        }
        




    }
}
