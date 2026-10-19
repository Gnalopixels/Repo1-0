package com.ercilla;

public class Hola {
    public static void main(String[] args) {
        mensaje msg = new mensaje();
        String nombre = msg.solicitarDatos("Escribe tu puto nombre: ");
        String apellido = msg.solicitarDatos("Escribe tu puto apellido: ");
        Persona p1 = new Persona(nombre, apellido);
        msg.saludar(p1);
    }
}
