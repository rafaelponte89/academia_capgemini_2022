package escada.escada.domain;

import lombok.RequiredArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Escada {
    private final int nivel;
    private final String degrau;
    private final String desenho;

    public Escada(){
        this(0,"*","");
    }



}
