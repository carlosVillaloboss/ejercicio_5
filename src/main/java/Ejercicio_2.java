package com.mycompany.ejercicio_2;

public class Ejercicio_2 {

    public static void main(String[] args) {
        int suma= 0;
        int x= 20;
        suma= suma + x;
        int y= 40;
        x= x+ y * y;
        double resultado= suma+((double)x/y);
        System.out.println(resultado);
    }
}
