package com.example;

public class ProgramaJugadores {
    public static void main(String[] args) {
        JugadorFutbol jugador1 = new JugadorFutbol("Juan Pérez", 25, "Delantero");
        JugadorFutbol jugador2 = new JugadorFutbol("Carlos Ruiz", 28, "Defensa");
        JugadorFutbol jugador3 = new JugadorFutbol("Luis Gómez", 22, "Portero");

        jugador1.presentarse();
        jugador2.presentarse();
        jugador3.presentarse();

       
        jugador1.cambiarPosicion("Centrocampista");
        jugador1.presentarse();
    }
}