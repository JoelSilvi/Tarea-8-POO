package tarea8;

import javax.swing.*;

public class Tarea {
    public static void main(String[] args) {
        String[] optionsToChoose = {"Arica y Parinacota", "Tarapac�", "Antofagasta", "Atacama", "Coquimbo", "Valpara�so", 
        		"Regi�n del Libertador Gral. Bernardo O�Higgins", "Regi�n del Maule", "Regi�n de �uble", "Regi�n del Biob�o",
        		"Regi�n de la Araucan�a", "Regi�n de Los R�os", "Regi�n de Los Lagos", "Regi�n Ais�n del Gral. Carlos Ib��ez del Campo",
        		"Regi�n de Magallanes y de la Ant�rtica Chilena", "Regi�n Metropolitana de Santiago"};

        String getRegion = (String) JOptionPane.showInputDialog(
                null,
                "Regiones",
                "Elige una regi�n",
                JOptionPane.QUESTION_MESSAGE,
                null,
                optionsToChoose,
                optionsToChoose[0]);

        System.out.println("Tu regi�n es: " + getRegion);
    }
}