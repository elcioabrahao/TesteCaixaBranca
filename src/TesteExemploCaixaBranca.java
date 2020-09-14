import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteExemploCaixaBranca {

    private ExemploCaixaBranca exemploCaixaBranca;

    @Before
    public void setup() {
        exemploCaixaBranca = new ExemploCaixaBranca();
    }

    @Test
    public void teste1(){
        String esperado = "ace-1234";
        String atual = exemploCaixaBranca.execute(2,0,5);
        assertEquals(esperado,atual);
    }

    @Test
    public void teste2(){
        String esperado = "abe-134";
        String atual = exemploCaixaBranca.execute(2,1,1);
        assertEquals(esperado,atual);
    }

    @Test
    public void teste3(){
        String esperado = "abe-134";
        String atual = exemploCaixaBranca.execute(1,0,2);
        assertEquals(esperado,atual);
    }

    @Test
    public void teste4(){
        String esperado = "abd-13";
        String atual = exemploCaixaBranca.execute(1,1,1);
        assertEquals(esperado,atual);
    }


}
