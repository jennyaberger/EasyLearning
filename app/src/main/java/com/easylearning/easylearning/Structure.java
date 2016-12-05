package com.easylearning.easylearning;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Date: 25.11.16
 * Author: Jenny Berger
 * E-mail: jenny.a.berger@gmail.com
 * Company: Robotics and Biology Laboratory (RBO)
 */

public class Structure {

    Structure(){
    }

    //---------- Main -----------//
    private int[] main = {R.string.electrostatic_field, R.string.electrical_flow_field};

    public int[] getStructure() {
        return  main;
    }

    //----------- Topic -----------//
    private ArrayList<String> electrostaticField = new ArrayList<>(Arrays.asList("Elektrische Ladung", "Ladungsdichten", "Columb'sches Gestz", "Elektrische Feldstärke", "Überlagerung von Feldern", "Darstellung von Feldern", "Elektrische Spannungen und Potentiale", "Darstellung von Äquipotentiallinien und -flächen", "Influenz", "Dielektrische Polarisation", "Sprungestellen bei Dielektrizitätskonstanten"));
    private ArrayList<String> electricalFlowField = new ArrayList<>(Arrays.asList("Ladungsträgerbewegung", "Elektrischer Strom", "Stromdichte", "Definition Stationäres Stromungsfeld", "Spezifische Leitfähigkeit und spezifischer Widerstand", "Ohm'sches Gesetz", " Praktische Ausführungsformen von Widerstanden", "Feldgrößen an Grenzflächen", "Energie und Leistung", "Energie- und Leistungsdichte"));

    public ArrayList<String> getTopic(int i) {
        if (i == R.string.electrostatic_field) {i = 0;}
        return selectTopic(Integer.toString(i));
    }

    public ArrayList<String> getTopic(String s) {
        return selectTopic(s);
    }

    private ArrayList<String> selectTopic(String topic) {
        switch (topic) {
            case "0":
            case "electrostaticField":
                return electrostaticField;
            default: return electricalFlowField;
        }
    }

    //---------- Content -----------//
    String h = "header";
    String t = "text";
    String q = "quiz";

    //........... electrical Charge ...........//
    private ArrayList<String> electricalCharge = new ArrayList<>(Arrays.asList("Herleitung: Ladung", "Ladungstrennung (Ionisation)"));
    private ArrayList<String> chargeDensity = new ArrayList<>(Arrays.asList("Linienladung", "Berechnung von Ladungsdichten", "Ladungsträger im Festkörper"));
    private ArrayList<String> coulombsLaw = new ArrayList<>(Arrays.asList("Herleitung: Coulomb'sches Gesetz", "Mehrfache Kraftwirkung auf eine Punktladung"));
    private ArrayList<String> electricFieldStrength = new ArrayList<>(Arrays.asList("Herleitung: Elektrische Feldstärke", "Eigenschaften der Feldstärke"));
    private ArrayList<String> superpositionOfFields = new ArrayList<>(Arrays.asList("Feld einer Punktladung", "Feld mehrer Punktladungen", "Feld einer Linienladung"));
    private ArrayList<String> presentationOfFields = new ArrayList<>(Arrays.asList("Begriff: Feldlinie", "Konstruktion von Feldlinien", "Berechnung von Feldlinien"));

   /* public String[] getContent(int i) {
        if (i == R.string.electrostatic_field) {i = 0;}
        return selectTopic(Integer.toString(i));
    }*/

    public ArrayList<String> getContent(String s) {
        return selectContent(s);
    }

    private ArrayList<String> selectContent(String topic) {
        switch (topic) {
            case "0":
            case "Elektrische Ladung":
                return electricalCharge;
            case "1":
            case "Ladungsdichten":
                return chargeDensity;
            case "2":
            case "Columb'sches Gestz":
                return coulombsLaw;
            case "3":
            case "Elektrische Feldstärke":
                return electricFieldStrength;
            case "4":
            case "Überlagerung von Feldern":
                return superpositionOfFields;
            default: return presentationOfFields;
        }
    }


}
