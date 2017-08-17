
import Codigo.Utilitarios;
import org.junit.Test;
import static org.junit.Assert.*;


public class Testes {
    
@Test
public void TestDecimal(){
    final int DECIMAL = 45;
    final String BINARIO = "101101";
    final String CONVERSAO = Utilitarios.DecimalParaBinario(DECIMAL);
       assertTrue(CONVERSAO.equals(BINARIO));
}     
@Test
public void TestBinario(){
    final String BINARIO = "110100";
    final String HEXADECIMAL = "34";
    final String CONVERSAO = Utilitarios.BinarioParaHexadecimal(BINARIO);
    assertTrue(CONVERSAO.equals(HEXADECIMAL));
} 
@Test
public void TestHexadecimal(){
    final String HEXADECIMAL = "F";
    final String OCTAL = "17";
    final String CONVERSAO = Utilitarios.HexadecimalParaOctal(HEXADECIMAL);
    assertTrue(CONVERSAO.equals(OCTAL));
} 

}
