package pract3;

import org.junit.jupiter.api.Assertions;
import static pract3.AmericanConverter.*;

class AmericanConverterTest {

    @org.junit.jupiter.api.Test
    void convertSmToDmTest() {
        Assertions.assertEquals(1d, convertSmToDm(2.54));
        Assertions.assertEquals(2d, convertSmToDm(5.08));
    }

    @org.junit.jupiter.api.Test
    void convertDmToFootTest() {
        Assertions.assertEquals(1d, convertDmToFoot(12d));
        Assertions.assertEquals(2d, convertDmToFoot(24d));
    }

    @org.junit.jupiter.api.Test
    void convertFootToYardTest() {
        Assertions.assertEquals(1d, convertFootToYard(3d));
        Assertions.assertEquals(2d, convertFootToYard(6d));
    }

    @org.junit.jupiter.api.Test
    void convertYardToMileTest() {
        Assertions.assertEquals(1d, convertYardToMile(1.760));
        Assertions.assertEquals(2d, convertYardToMile(3.520));
    }

    @org.junit.jupiter.api.Test
    void convertDmToHandTest() {
        Assertions.assertEquals(1d, convertDmToHand(4d));
        Assertions.assertEquals(2d, convertDmToHand(8d));
    }
}