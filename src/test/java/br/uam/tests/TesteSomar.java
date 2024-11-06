
package br.uam.tests;

import br.uam.entities.Calculadora;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Joao Rodolfo
 */
public class TesteSomar {
    
    @Test
    public void Somar() {
        var calculadora = new Calculadora();
        assertEquals(4, calculadora.somar(2,2));
    }
}