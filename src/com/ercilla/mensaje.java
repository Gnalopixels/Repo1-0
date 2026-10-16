package com.ercilla;

import java.util.Scanner;

public class mensaje {
    public String solicitarDatos(String mensaje) {
        System.out.print(mensaje);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public void saludar(String nombre) {
        System.out.printf("Hola %s, bien culeado a gaba\n", nombre);

    }
}
