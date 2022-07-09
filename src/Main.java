package com.company;

public class Main {

    public static void main(String[] args)
    {

        int numeroIf = 3;


        if(numeroIf < 0){
            System.out.println("numeroIf: " + numeroIf + " es numero negativo");
        } else if (numeroIf > 0) {
            System.out.println("numeroIf: " + numeroIf + " es numero positivo");
        }
        else {
            System.out.println("numeroIf: " + numeroIf + " es el numero cero");
        }
        int numeroWhile = 0;

        while(numeroWhile < 3){

            numeroWhile++;
            System.out.println("numeroWhile: " + numeroWhile);

        }

        int numeroDoWhile = 3;

        do {
            numeroDoWhile++;
            System.out.println("numeroDoWhile: " + numeroWhile);
        }
        while (numeroWhile < 3);{

        }

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){

        System.out.println("el numeroFor es: " + numeroFor);

        }

        String estacion = "verano";

        switch (estacion){
            case "invierno":
                System.out.println("La estacion es invierno");
                break;
            case "otoño":
                System.out.println("La estacion es otoño");
                break;
            case "verano":
                System.out.println("La estacion es verano");
                break;
            case "primavera":
                System.out.println("La estacion es primavera");
                break;
            default:
                System.out.println("no es una estacion");
        }

    }






}


