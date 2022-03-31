package docente;

public class Docente {
    private String nome;
    private String cognome;
    private int matricola;

    public Docente (String nome,String cognome, int matricola){
        this.nome=nome;
        this.cognome=cognome;
        this.matricola=matricola;

    }

    public void setNome (String nomeDocente){
        this.nome=nomeDocente;



    }
    public void setCognome (String cognomeDocente){
        this.cognome=cognomeDocente;


    }
    public void setMatricola ( int matricolaDocente){
        this.matricola=matricolaDocente;

    }
    public String getNome (){
        return this.nome ;

    }
    public String getCognome (){
        return this.cognome;

    }
    public int getMatricola () {
        return this.matricola;


    }
}



