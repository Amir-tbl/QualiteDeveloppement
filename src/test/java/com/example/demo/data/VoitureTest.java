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

}
