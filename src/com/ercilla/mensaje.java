package com.ercilla;

import java.util.Scanner;

public class mensaje {
    public String solicitarDatos(String mensaje) {
        System.out.print(mensaje);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public void saludar(Persona p1) {
        System.out.printf("Hola %s, bien culeado a gaba\n", p1.getNombre()+" "+p1.getApellido());

    }
}
