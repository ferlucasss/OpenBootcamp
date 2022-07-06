package com.company;

public class Main {

    public static void main(String[] args)
    {
        suma(1,3,6);
        Coche miCoche = new Coche();
        miCoche.AñadirPuerta();
        System.out.println(miCoche.puertas);
    }

    public static void suma(int a, int b, int c){
        System.out.println(a+b+c);
    }



}

class Coche {
    public int puertas = 0;

    public void AñadirPuerta() {
        this.puertas++;
    }

}
