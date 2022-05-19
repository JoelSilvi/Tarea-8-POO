package tarea8;

import javax.swing.*;

public class Tarea {
    public static void main(String[] args) {
        String[] optionsToChoose = {"Arica y Parinacota", "Tarapacá", "Antofagasta", "Atacama", "Coquimbo", "Valparaíso", 
        		"Región del Libertador Gral. Bernardo O’Higgins", "Región del Maule", "Región de Ñuble", "Región del Biobío",
        		"Región de la Araucanía", "Región de Los Ríos", "Región de Los Lagos", "Región Aisén del Gral. Carlos Ibáñez del Campo",
        		"Región de Magallanes y de la Antártica Chilena", "Región Metropolitana de Santiago"};

        String getRegion = (String) JOptionPane.showInputDialog(
                null,
                "Regiones",
                "Elige una región",
                JOptionPane.QUESTION_MESSAGE,
                null,
                optionsToChoose,
                optionsToChoose[0]);

        System.out.println("Tu región es: " + getRegion);
    }
}