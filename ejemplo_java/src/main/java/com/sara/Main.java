package com.sara;

import java.util.Random;
import java.util.Scanner;

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

        // main3(args);
        main5(args);
    }

    public static float ohNoRayos = 0.5f;
    public static final int DIAS_SEMANALES = 7;

    // MATEMATICAS

    // public static void main2(String[] args) {
    // System.out.println(1+2);
    // System.out.println(1-2);
    // System.out.println(1*2);
    // System.out.println(1/2);
    // System.out.println(10%2);
    // actividades()

    // System.out.println(Math.pow());

    // circunferencia(diametro: 30);
    // }

    // public static double circunferencia(int diametro) {
    // System.out.println("Circunferencia: ");
    // return 2 * Math.PI *diametro;

    public static void main2(String[] args) {
        int dia = 5;
        actividades(dia);
        actividades(++dia);
        actividades(dia++);
        actividades(dia);
    }

    public static void actividades(int dia) {
        String[] cosasPorHacer = { "Estudiar en campus", "Venir a Campus", "Ir a Campus", "Asistir a Campus",
                "Comer helado", "Comprar papitas", "Dormir" };

        System.out.println("¿Que nos toca hacer hoy?");
        if (dia >= DIAS_SEMANALES) {
            System.out.println("Bye");

        } else {
            System.out.println(cosasPorHacer[dia]);
            System.out.println(dia);
        }

    }

    // AQUI LLAMAMOS LA VARIABLE QUE CREE EN EL NUEVO ARCHIVO CONDICIONALES

    // se crea una instancia cuando no hay static
    public static void main3(String[] args) {
        condicionales instancia = new condicionales();
        instancia.esPar();

        // No se crea una instancia cuando HAY STATIC
        condicionales.diaSemana();

        String cadena = "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos electrónicos, quedando esencialmente igual al original.";

        int resultado = instancia.longitudDeText(cadena);
        System.out.println("Cuantas letras tiene?" + resultado);
        System.out.println("Esta?" +
                (instancia.estaLaPalabra(cadena, "años")
                        ? "SI ESTA"
                        : "NO ESTA"));

        // ACTIVIDAD: CUENTA CUANTOS CARACTERES HAY SIN ESPACIOS
        String espacios = cadena.replaceAll("\\s", "");
        System.out.println(espacios.length());

        // ACTIVIDAD: DADO 3 NUMEROS VERIFICA CUAL ES MAYOR

    }

    // INSERTAR DATOS EN LA CONSOLA (CLASE 3)
    final static int maxRange = 10000;

    public static void main4(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingrese el valor minimo");
        var min = scan.nextInt();
        System.out.println("Ingrese el valor maximo");
        var max = scan.nextInt();
        int[] numbers = new int[maxRange];
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = random.nextInt(min, max + 1);
        }
        System.out.println("Ingrese la cantidad de numeros a buscar: ");
        var counter = scan.nextInt();
        for (int a = 0; a < counter; a++) {
            System.out.println("Ingrese el indice a buscar [1 hasta " + maxRange + "]: ");
            var index = scan.nextInt();
            System.out.println("Oye el indice es: " + (index) + " = " + numbers[index - 1]);
        }
        scan.close();

    }
    
    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el Titulo del libro: ");
        var titulo = scan.nextLine();
        System.out.print("Ingrese el nombre del autor: ");
        var autor = scan.nextLine();
        System.out.print("Ingrese el anio de la publicacion: ");
        var año = scan.nextInt();
        System.out.print("¿Cual es el genero del libro?: ");
        var genero = scan.nextLine();
        scan.nextLine();
        System.out.print("Ingrese el numero de paginas: ");
        var pags = scan.nextInt();

        System.out.println("Titulo: " +titulo);
        System.out.println("Autor del libro: " +autor);
        System.out.println("Año de publicacion: " +año);
        System.out.println("Genero del libro: " +genero);
        System.out.println("Numero de paginas: " +pags);
        scan.close();
    }
    
}