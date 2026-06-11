package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EchantillonTests {

    @Test
    void testConstructeurParDefautEtSetters() {
        Echantillon echantillon = new Echantillon();
        echantillon.setNombreDeVoitures(3);
        echantillon.setPrixMoyen(12000);
        assertEquals(3, echantillon.getNombreDeVoitures());
        assertEquals(12000, echantillon.getPrixMoyen());
    }

}
