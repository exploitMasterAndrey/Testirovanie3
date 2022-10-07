package pract3;
import static pract3.SiConverter.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SiConverterTest {

    @Test
    void convertTimeTest() {
        Assertions.assertEquals(10, convertTime("msec", 10000));
        Assertions.assertEquals(15, convertTime("sec", 15));
        Assertions.assertEquals(60, convertTime("min", 1));
        Assertions.assertEquals(3600, convertTime("hr", 1));
    }

    @Test
    void convertWeightTest() {
        Assertions.assertEquals(1, convertWeight("gr", 1000));
        Assertions.assertEquals(15, convertWeight("kg", 1));
        Assertions.assertEquals(1000, convertWeight("tonne", 1));
        Assertions.assertEquals(1000000, convertWeight("ktonne", 1));
    }

    @Test
    void convertTemperatureTest() {
        Assertions.assertEquals(1, convertTemperature("c", 1));
        Assertions.assertEquals(1, convertTemperature("f", -17.222));
        Assertions.assertEquals(1, convertTemperature("k", -272.15));
        Assertions.assertEquals(1, convertTemperature("r", 1.25));
        Assertions.assertEquals(1, convertTemperature("ra", -272.594));
    }
}