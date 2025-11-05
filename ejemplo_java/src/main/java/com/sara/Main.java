package com.sara;

public class Main {
    public static void main(String[] args) {
        // Declaramos variables
        int numero = 100;
        long otroNumero = 10L;
        boolean bandera = true;
        float decimal = 0.5f;
        double decimalPro = 0.5;
        char caracter = 'A';
        String saludo = "Hello sara";

        // Llamamos variables
        System.out.println("Hello world"); // (saludo)
        System.out.println(1); // (numero)
        System.out.println(10000000L); // (otroNumero)
        System.out.println(true); // (bandera)
        System.out.println(0.4f); // (decimal)
        System.out.println(0.4); // (decimalPro)
        System.out.println('A'); // (caracter)

        // ARRAY
        System.out.println("Tipos referencias");

        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(saludo);

        // Variable constante
        // Las VARIABLES CONSTANTE SE DEFINEN CON final
        final int xdex = 0;
        System.out.println(xdex);
        // Si queremos declarar variables accesibles fuera del metodo
        main2(args);
    }

    public static float ohNoRayos = 0.5f;
    public static final int DIAS_SEMANALES = 7;

// MATEMATICAS

    // public static void main2(String[] args) {
    //     System.out.println(1+2);
    //     System.out.println(1-2);
    //     System.out.println(1*2);
    //     System.out.println(1/2);
    //     System.out.println(10%2);
    //     actividades()

    //     System.out.println(Math.pow());

    //       circunferencia(diametro: 30);
    // }

    // public static double circunferencia(int diametro) {
    //     System.out.println("Circunferencia: "); 
    //     return 2 * Math.PI *diametro;

    public static void main2(String[] args) {
        int dia = 5;
        actividades(dia);
        actividades(++dia);
        actividades(dia++);
        actividades(dia);
    }

    public static void actividades(int dia) {
        String[] cosasPorHacer = { "Estudiar en campus", "Venir a Campus", "Ir a Campus", "Asistir a Campus", "Comer helado", "Comprar papitas", "Dormir" };
        
        System.out.println("¿Que nos toca hacer hoy?"); 
        if (dia >= DIAS_SEMANALES) {
            System.out.println("Bye"); 

        } else {
            System.out.println(cosasPorHacer[dia]);
            System.out.println(dia);
        }

    }
}