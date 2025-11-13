package com.sara;


import java.util.Random;
import java.util.Scanner;

import com.sara.ejercicios.Factorial;
import com.sara.ejercicios.Trainer;
import com.sara.game.ahorcado.Ahorcado;
import com.sara.ejercicios.bank.*;
import com.sara.ejercicios.Camper;

public class Main {

    // Variables fuera de métodos deben ser estáticas si se usan en main
    // static String saludo = "Hello World";
    // public static float ohNoRayos = 0.5f;
    // public static final int DIAS_SEMANALES = 7;

    // public static void main(String[] args) {

    // // Declaramos variables
    // int numero = 100;
    // long otroNumero = 10L;
    // boolean bandera = true;
    // float decimal = 0.5f;
    // double decimalPro = 0.5;
    // char caracter = 'A';

    // // Llamamos variables
    // System.out.println(saludo);
    // System.out.println(numero);
    // System.out.println(otroNumero);
    // System.out.println(bandera);
    // System.out.println(decimal);
    // System.out.println(decimalPro);
    // System.out.println(caracter);

    // // ARRAY
    // System.out.println("Tipos referencias");

    // int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    // System.out.println(numeros[0]);
    // System.out.println(numeros[1]);
    // System.out.println(numeros[2]);
    // System.out.println(numeros[3]);
    // System.out.println(saludo);

    // // Constante
    // final int xdex = 0;
    // System.out.println(xdex);

    // main2(args); // Llamado al segundo método
    // }

    // // MATEMÁTICAS
    // public static void main2(String[] args) {
    // System.out.println(1 + 2);
    // System.out.println(1 - 2);
    // System.out.println(1 * 2);
    // System.out.println(1 / 2);
    // System.out.println(10 % 2);

    // // Math.pow necesita 2 argumentos
    // System.out.println(Math.pow(2, 3)); // 2^3 = 8

    // // Llamado a circunferencia
    // System.out.println("Circunferencia: " + circunferencia(30));

    // // Ejercicio actividades
    // int dia = 5;
    // actividades(dia);
    // actividades(++dia);
    // actividades(dia++);
    // actividades(dia);
    // }

    // public static double circunferencia(int diametro) {
    // return 2 * Math.PI * diametro;
    // }

    // public static void actividades(int dia) {
    // String[] cosasPorHacer = {
    // "Hacer modulos ingles",
    // "Venir a campus",
    // "Irme de campus",
    // "Dormir",
    // "Ser feliz",
    // "Repasar Java :(",
    // "No volver a Campus"
    // };

    // System.out.println("¿Qué nos toca hacer HOY?");

    // if (dia >= 7) {
    // System.out.println("Bye!");
    // } else {
    // System.out.println(cosasPorHacer[dia]);
    // System.out.println("Día: " + dia);
    // }
    // }

    // public class Main {
    // final static int maxRange = 10000;
    // public static void main(String[] args) {
    // Scanner scan = new Scanner(System.in);
    // Random random = new Random();
    // System.out.println("Ingrese el valor minimo: ");
    // var min = scan.nextInt();
    // System.out.println("Ingrese el valor minimo: ");
    // var max = scan.nextInt();
    // int [] numbers = new int [maxRange];
    // for (int a=0; a< numbers.length; a++) {
    // numbers[a] = random.nextInt(min, max+1);
    // }
    // system.out.println("Ingrese la cantidad de numeros a buscar: ");
    // var counter = scan.nextInt();
    // for( int a=0; a < counter; a++) {
    // system.out.println("Ingrese el indice a buscar [ 1hasta + "+maxRange+"]: " );
    // var index =scan.nextInt();
    // system.out.println("Oye el indice es: " + (index) + " = " + numbers[index -1]
    // );

    // }
    // scan.close();
    // }
    // }

    public static void main1(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Ingrese el titulo del libro: ");
        // var titulo = scan.nextLine();
        // System.out.println("Ingrese el autor del libro: ");
        // var autor = scan.nextLine();
        // System.out.println("Ingrese el anio de la publicacion: ");
        // var anio = scan.nextInt();
        // scan.nextLine();
        // System.out.println("Ingrese el genero del libro: ");
        // var genero = scan.nextLine();
        // System.out.println("Ingrese el numero de paginas: ");
        // var paginas = scan.nextLine();

        // System.out.println("Titulo: " + titulo);
        // System.out.println("Autor del libro: " + autor);
        // System.out.println("Anio de publicacion: " + anio);
        // System.out.println("Genero del libro: " + genero);
        // System.out.println("Numero de paginas: " + paginas);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        var ahoracado = new Ahorcado();
        var factorial = new Factorial();
        while (flag) {
            System.out.println("""
                    ++++++++++++++  MENU  ++++++++++++++
                            ** Ingrese la opcion deseada **
                    1. Jugar al Ahoracado
                    2. Palabras Adivinadas
                    0. Salir
                    """);
            switch (scan.nextInt()) {
                case 1:
                ahoracado.iniciar("X");
                    ahoracado.ejecutar(scan);
                    break;
                case 2:
                    System.out.println(ahoracado.palabrasAdivinadas);
                    break;
                case 3:
                    //Administrativo
                    //Trainer
                    //Colabarador
                    Camper camper = new Camper("Andrues","Perrea",16,
                    "TI", "10051234512",
                    "?","adrian@gmail.com","12345600");
                    System.out.println(camper.telefono);
                    /*camper.nombre = "Andrues";
                    camper.apellido = "Perrea";
                    camper.edad = 16;
                    camper.tipoDocumento = "TI";
                    camper.documento = "1005123456";
                    camper.estratoSocial = -1;
                    camper.genero = "?";
                    camper.email = "andresitto_777@gmail.com";*/
                    camper.telefono = "018000918080";
                    System.out.println(camper.telefono);
                    //camper.nivelIngles = 10;

                    camper.dormir();
                    camper.divertirse();

                    camper.cambiarNombre("Poncio Zuleta");
                    camper.reportar();
                    camper.calificar();


                    break;

                case 4:
                    Trainer trainer = new Trainer();
                    trainer.nombre = "Adriaaaaann";
                    trainer.apellido = "Nunez";
                    /*trainer.edad = 27;
                    trainer.tipoDocumento = "CC";
                    trainer.documento = "1097101921";
                    trainer.estratoSocial = 8;
                    trainer.genero = "masculino";
                    trainer.email = "adriannnnn00@gmail.com";
                    trainer.telefono = "018000918080";
                    trainer.skill = "Software";*/


                    trainer.dormir();
                    trainer.divertirse();
                    trainer.eseniar();
                    trainer.tomacafe();

                case 0:
                    // Salir
                    flag = false;
            }
        }
     }
    
    public class main1{
    final static int maxRange = 10000;

    public static void main(String[] args) {
        // Crea una clase BankAccount con el atributo privado balance.
        // Implementa los métodos deposit(double amount) y withdraw(double amount)
        // que validen las cantidades correctamente.
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        var account = new BankAccount();
        while (flag) {
            System.out.println("""
                    ++++++++++++++  MENU  ++++++++++++++
                            ** Ingrese la opcion deseada **
                    1. Consignar
                    2. Retirar
                    3. Ver Saldo
                    0. Salir
                    """);
            switch (scan.nextInt()) {
                case 1:
                    System.out.println("Ingrese el monto en numeros enteros a depositar: ");
                    account.deposit(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Ingrese el monto en numeros enteros a retirar: ");
                    account.withdraw(scan.nextInt());
                    break;
                case 3:
                    System.out.println("Su Saldo es: $"+account.showBalance());
                    break;
                case 0:
                    // Salir
                    flag = false;

                    break;
                default:
                    System.out.println("Ingrese una opcion " +
                            "valida......\nPresione Enter para continuar.");
                    scan.nextLine();
                    break;
            }
        }
        scan.close();
    }
}


// Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.

    public class main3{
        public static void main(String[] args) {
            boolean flag = true;
            User common = new User();
            Admin admin = new Admin();
            User user = new Admin();

            while (flag) {
                System.out.printl("""
                *********  MENU  ********
                * Ingrese la opcion deseada *
                1. Ingrese su nombre
                2. Ingrese su password
                3. Validar password
                4. Agregar permisos (ADMINISTRADORES)
                5. Ver permisos (ADMINISTRADORES)
                0. Salir
                """);
            switch (scan.nextInt()) {
                case 6:
                    System.out.printl(admin.showInfo());
                    break;
                case 5:
                    System.out.println(admin.showPermissions());
                    System.out.println((Admin)user.showPermissions());
                    break;
                case 4:
                    scan.nextLine();
                    var permiso = sacn.nextLine();
                    var permisos = new String[]{"x","y","z"};
                    //common.setPermissions();
                    admin.setPermissions(permiso);
                    ((Admin)user).setPermissions(permisos);
                    //((Admin)common).setPermissions(permisos); X
                    break;
                case 1:
                    scan.nextLine();
                    var tempName = scan.nextLine();
                    common.setUsername(tempName);
                    admin.setUsername(tempName);
                    user.setUsername(tempName);
                    break;
                case 2:
                    scan.nextLine();
                    var tempPassword = scan.nextLine();
                    common.setPassword(tempPassword);
                    admin.setPassword(tempPassword);
                    user.setPassword(tempPassword);
                    break;
                case 3:
                    scan.nextLine();
                    var tempChechkPassword = scan.nextLine();
            }
        }
    }
}
 

                    