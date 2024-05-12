import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest {
    @Test
    void getSuma() {// TEST QUE SUMA 2 NÚMEROS
        Suma suma = new Suma(3.5,4.5);
        assertEquals(8,suma.getSuma());
    }

    @Test
    void incrementa() {// TEST QUE INCREMENTA UN NÚMERO EN 1
        Suma suma = new Suma(3);
        assertEquals(4,suma.incrementar());
    }
}