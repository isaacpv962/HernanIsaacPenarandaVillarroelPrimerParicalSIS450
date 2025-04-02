import org.junit.Test;
import static org.junit.Assert.*;

public class AreaCirculoTest {

    private static final double MARGEN_ERROR = 0.0001;

    @Test
    public void testCalcularAreaConRadioPositivo() {
        double radio = 5.0;
        double areaEsperada = Math.PI * 25.0;
        assertEquals(areaEsperada, AreaCirculo.calcularArea(radio), MARGEN_ERROR);
    }

    @Test
    public void testCalcularAreaConRadioCero() {
        double radio = 0.0;
        double areaEsperada = 0.0;
        assertEquals(areaEsperada, AreaCirculo.calcularArea(radio), MARGEN_ERROR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcularAreaConRadioNegativo() {
        double radio = -3.0;
        AreaCirculo.calcularArea(radio);
    }

    @Test
    public void testCalcularAreaConRadioGrande() {
        double radio = 1000.0;
        double areaEsperada = Math.PI * 1000000.0;
        assertEquals(areaEsperada, AreaCirculo.calcularArea(radio), MARGEN_ERROR);
    }

    @Test
    public void testCalcularAreaConRadioDecimal() {
        double radio = 2.5;
        double areaEsperada = Math.PI * 6.25;
        assertEquals(areaEsperada, AreaCirculo.calcularArea(radio), MARGEN_ERROR);
    }
}