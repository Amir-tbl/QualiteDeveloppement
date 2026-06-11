package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoitureAvecConstructeurParDefaut() {
        Voiture voiture = new Voiture();
        assertNull(voiture.getMarque());
        assertEquals(0, voiture.getPrix());
        assertEquals(0, voiture.getId());
    }

    @Test
    void creerVoitureAvecConstructeur() {
        Voiture voiture = new Voiture("Renault", 15000);
        assertEquals("Renault", voiture.getMarque());
        assertEquals(15000, voiture.getPrix());
    }

    @Test
    void testSetMarque() {
        Voiture voiture = new Voiture();
        voiture.setMarque("Peugeot");
        assertEquals("Peugeot", voiture.getMarque());
    }

    @Test
    void testSetPrix() {
        Voiture voiture = new Voiture();
        voiture.setPrix(20000);
        assertEquals(20000, voiture.getPrix());
    }

    @Test
    void testSetId() {
        Voiture voiture = new Voiture();
        voiture.setId(42);
        assertEquals(42, voiture.getId());
    }

    @Test
    void testToString() {
        Voiture voiture = new Voiture("Toyota", 25000);
        voiture.setId(1);
        String result = voiture.toString();
        assertTrue(result.contains("Toyota"));
        assertTrue(result.contains("25000"));
        assertTrue(result.contains("1"));
    }

}
