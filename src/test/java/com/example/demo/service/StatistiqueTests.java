package com.example.demo.service;

import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@SpringBootTest
public class StatistiqueTests {

    @MockBean
    StatistiqueImpl statistiqueImpl;

    @Test
    void testAjouterVoiture() {
        Voiture voiture = new Voiture("Renault", 15000);
        statistiqueImpl.ajouter(voiture);
        verify(statistiqueImpl, times(1)).ajouter(voiture);
    }

    @Test
    void testPrixMoyen() {
        Echantillon echantillon = new Echantillon(2, 17500);
        when(statistiqueImpl.prixMoyen()).thenReturn(echantillon);

        Echantillon result = statistiqueImpl.prixMoyen();
        assertEquals(2, result.getNombreDeVoitures());
        assertEquals(17500, result.getPrixMoyen());
    }

}
