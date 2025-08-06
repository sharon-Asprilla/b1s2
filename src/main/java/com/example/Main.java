package com.example;

public class Main {
    public static void main(String[] args) {

        Estadio estadio1 = new Estadio();
        estadio1.nombre = "Atanasio Girardot";
        estadio1.ciudad = "Medellín";
        estadio1.capacidad = 40000;

        Estadio estadio2 = new Estadio();
        estadio2.nombre = "Metropolitano";
        estadio2.ciudad = "Barranquilla";
        estadio2.capacidad = 46000;

        estadio1.mostrarInformacion();
        estadio2.mostrarInformacion();
    }
}

