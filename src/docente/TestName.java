package docente;

import java.util.*;

public class TestName {
    public static void main(String[] args) {
        Docente primoDocente= new Docente("marco","rossi",120 );
        Docente secondoDocente= new Docente ("giovanni","pace",121 );
        Docente terzoDocente = new Docente ("luca","bianchi",122);
        List<Docente> listaDocenti = new ArrayList<>();
        listaDocenti.add(primoDocente);
        listaDocenti.add(secondoDocente);
        listaDocenti.add(terzoDocente);
        int i=0;
        while (i< listaDocenti.size()) {
            if (listaDocenti.get(i).getNome().equals("giovanni")){
                listaDocenti.remove(i);
                i--;

            }else {
                System.out.println(listaDocenti.get(i).getNome()+listaDocenti.get(i).getCognome()+listaDocenti.get(i).getMatricola());
            }
            i++;

        }

    }


}







