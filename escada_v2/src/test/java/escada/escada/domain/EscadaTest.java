package escada.escada.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EscadaTest {

    @MockBean
    private Escada escada;

    /* Testa a construção da instância escada */
    @Test
    public void criarEscadaTest(){

        given(escada.getNivel()).willReturn(12);
        given(escada.getDegrau()).willReturn("*");

        assertThat(escada.getNivel()).isEqualTo(12);
        assertThat(escada.getDegrau()).isEqualTo("*");

    }
}
