package com.ercilla;

public record PersonaRegistro(String nombre, String apellido) {
    public String toString() {
        System.out.println("Esta intruccdion es irreversivle");
        return "%s %s".formatted(nombre, apellido);
    }
}
