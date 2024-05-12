import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaTest {

    // TESTS PARA LA CLASE RESTA
    @Test
    void getResta(){// TEST QUE RESTA 2 NÚMEROS
        Resta resta = new Resta(10.5,2.2);
        assertEquals(8.3,resta.getResta());
    }

    @Test
    void decrementar(){// TEST QUE DECREMENTA UN NÚMERO EN 1
        Resta resta = new Resta(10.5);
        assertEquals(9.5,resta.decrementa());
    }
}