package escada.escada.service;

import escada.escada.domain.Escada;
import org.springframework.stereotype.Service;

@Service
public class EscadaService {

    Escada objetoEscada = new Escada();

    public Escada criarEscada(Escada escada){

        int altura = escada.getNivel();
        String degrau = escada.getDegrau();
        String escadaDegraus ="";
        int temp = altura;
        int deg = 0;

        for (int i=0; i < altura; i++){
            temp -=1;
            for(int j=0; j < temp; j++){
                //escadaDegraus += " ";
                escadaDegraus += "&nbsp;&nbsp;";
            }
            deg +=1;
            for( int k = 0; k < deg; k++ ) {
                escadaDegraus += degrau;

            }
            //escadaDegraus += "\n";
            escadaDegraus += "<br>";


        }


        Escada escadaCopy = new Escada(altura,degrau,escadaDegraus);
        System.out.println(escadaCopy.getDesenho());
        objetoEscada = escadaCopy;
        return objetoEscada;

    }

    public String recuperaEscada(){

        String desenho = objetoEscada.getDesenho();
        return desenho;
    }




}
