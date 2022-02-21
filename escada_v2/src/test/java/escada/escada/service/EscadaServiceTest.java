package escada.escada.service;

import escada.escada.domain.Escada;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EscadaServiceTest {

    @MockBean
    EscadaService escadaService;

    @MockBean
    Escada escada ;

    /* Testa os serviços da Escada*/

    @Test
    public void criarEscadaServiceTest() {




    }

    @Test
    public void recuperarEscadaServiceTest(){
        String desenho = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;***<br>&nbsp;&nbsp;&nbsp;&nbsp;****<br>&nbsp;&nbsp;*****<br>******<br>\n";


    }

}
