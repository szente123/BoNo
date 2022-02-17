import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class vezerloTest {
    vezerlo vez;
    int [] tomb = {1,2,3,5,11,22};
    int [] tomb0 = {0,0,0,0};

    @BeforeEach
    void setUp() {
        vez = new vezerlo();
    }

    @AfterEach
    void tearDown() {
        vez = null;
    }

    @Test
    void osszegzesTetele() {
        assertEquals(44,vez.osszegzesTetele(tomb));
        assertNotEquals(40,vez.osszegzesTetele(tomb));
        assertEquals(0,vez.osszegzesTetele(tomb0));
    }
}