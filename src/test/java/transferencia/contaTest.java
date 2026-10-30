package transferencia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    public void realizarTransacao(){
        cliente xuxa = new cliente("xuxa", "12345678900", "1111111");
        cliente silviosantos = new cliente("silviosantos", "00987654321", "2222222");

    conta contaxuxa = new conta("0025", "2254", 2500.00, xuxa);
    conta contasilvio = new conta("0021", "2251", 3500.00, silviosantos);

    contaxuxa.realizarTransferencia(1000.00, contasilvio);
    assertEquals(1500.00, contaxuxa.getSaldo());
    assertEquals(4500.00, contasilvio.getSaldo());
    }

    @Test
    public void validarTransferenciaInvalida(){
        cliente xuxa = new cliente("xuxa", "12345678900", "1111111");
        cliente silviosantos = new cliente("silviosantos", "00987654321", "2222222");

        conta contaxuxa = new conta("0025", "2254", 2500.00, xuxa);
        conta contasilvio = new conta("0021", "2251", 3500.00, silviosantos);
        boolean resultado = contaxuxa.realizarTransferencia(3500.00, contasilvio);
    }

}