package com.ercilla;

public class Hola {
    public static void main(String[] args) {
        mensaje msg = new mensaje();
        String nombre = msg.solicitarDatos("Escribe tu puto nombre");
        msg.saludar(nombre);
    }
}
