package com.soydz.lab2;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DataControllerTest {

    private final DataController dataController = new DataController();

    @Test
    void health() {
        assertEquals("HEALTH CHECK OK", dataController.healthCheck());
    }

    @Test
    void version() {
        assertEquals("VERSION IS 1.0.0", dataController.version());
    }

    @Test
    void nationLength() {
        Integer nationsLength = dataController.getRandomNations().size();
        assertEquals(10, nationsLength);
    }

    @Test
    void currenciesLength() {
        Integer currenciesLength = dataController.getRandomCurrencies().size();
        assertEquals(20, currenciesLength);
    }

    @Test
    void testRandomCurrenciesCodeFormat() {
        DataController controller = new DataController();
        JsonNode response = controller.getRandomCurrencies();
        for (int i = 0; i < response.size(); i++) {
            JsonNode currency = response.get(i);
            String code = currency.get("code").asText();
            assertTrue(code.matches("[A-Z]{3}"));
        }
    }

    @Test
    void testRandomNationsPerformance() {
        DataController controller = new DataController();
        long startTime = System.currentTimeMillis();

        controller.getRandomNations();
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println(executionTime);
        assertTrue(executionTime < 2000);
    }

    @Test
    void aviationsLength() {
        Integer aviationsLength = dataController.getRandomAviation().size();
        assertEquals(20, aviationsLength);
    }
}
