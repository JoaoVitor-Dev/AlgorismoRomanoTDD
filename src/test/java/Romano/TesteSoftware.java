package Romano;

import org.example.Conversao;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TesteSoftware {
    @Test
    public void simbolosIguaisJuntos(){
        assertEquals(3, Conversao.converterParaDecimal("III"));
        assertEquals(30, Conversao.converterParaDecimal("XXX"));
        assertEquals(2000, Conversao.converterParaDecimal("MM"));
    }
    @Test
    public void simbolosDiferentesJuntos(){
        assertEquals(7, Conversao.converterParaDecimal("VII"));
        assertEquals(16, Conversao.converterParaDecimal("XVI"));
        assertEquals(150, Conversao.converterParaDecimal("CL"));
    }
     @Test
    public void subtracaoDeValorMenor(){
         assertEquals(4, Conversao.converterParaDecimal("IV"));
         assertEquals(19, Conversao.converterParaDecimal("XIX"));
         assertEquals(90, Conversao.converterParaDecimal("XC"));
    }
}
