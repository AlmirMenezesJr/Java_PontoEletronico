package pontoEletronico;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Usuario {
    
    String data = novaData();
        
    private String horaAtual = data;
    private String nomeUser;
    private String cpfUser;
    private String userHoraEntrada;
    private String userHoraSaida;

    public Usuario(String nome, String cpf){
        this.nomeUser = nome;
        this.cpfUser = cpf;
    }

    public String novaData(){
       
       
       Calendar hora = Calendar.getInstance();
       
        return hora.toString();

    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getCpfUser() {
        return cpfUser;
    }

    public void setCpfUser(String cpfUser) {
        this.cpfUser = cpfUser;
    }

    public String getUserHoraEntrada() {
        return userHoraEntrada;
    }

    public void setUserHoraEntrada() {
        this.userHoraEntrada = horaAtual;
    }

    public String getUserHoraSaida() {
        return userHoraSaida;
    }

    public void setUserHoraSaida() {
        this.userHoraSaida = horaAtual;
    }
    
}
