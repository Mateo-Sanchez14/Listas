package com.company;

import clases.Lista;

public class Main {

    public static void main(String[] args) {
//        Lista lista = Lista.crearLista();
//
//        lista.insertarAlInicio(1);
//        lista.insertarAlInicio(2);
//        lista.insertarAlInicio(5);
//        lista.insertarAlInicio(10);
//
//        //lista.mostrar();
//        lista.insertarAlFinal(3);
//        lista.insertarAlFinal(7);
//        lista.insertarAlFinal(9);
//        lista.insertarAlFinal(6);
//
//        lista.mostrar();
//        System.out.println("cantidad = " + lista.cantidad());
//        lista.borrarPrimero();// Borro el 10
//        lista.borrarUltimo(); //Borro el 6
//        lista.borrarConValor(1); // Borro el 1
//        lista.borrarEnPosicion(2); // Borro el 3
//        lista.mostrar();
//
//        System.out.println("El valor en la posición 2 es " + lista.dameValorEnPosicion(2) );
//        lista.modificarValorEnPosicion(7,1); //Cambio el 2 por un 7
//        lista.mostrar();
//        lista.insertarEnPosicion(3,1);
//        lista.mostrar();
//        Lista lista2 = Lista.crearLista();
//        lista2.insertarAlInicio(11);
//        lista2.insertarAlInicio(12);
//        lista2.insertarAlInicio(13);
//
//        lista2.mostrar();
//
//        Lista.mergeList(lista,lista2);
//
//        lista2.mostrar();
        int suma = sumaPar(123456);

        System.out.println("suma = " + suma);

        escribirInverso(123456);

        System.out.println("\nMateo es paliondre: " + esPalindrome("Mateo"));
        System.out.println("reconocer es paliondre: " + esPalindrome("reconocer"));
        System.out.println("amor a roma es paliondre: " + esPalindrome("amor a roma"));
    }

    public static int sumaPar(int x) {
        int d;
        if (x == 0) {
            return 0;
        } else {
            d = x % 10;
            if (d % 2 == 0) {
                return d + sumaPar(x / 10);
            } else return sumaPar(x / 10);
        }
    }

    public static void escribirInverso(int x) {
        if (x <= 10) {
            System.out.print(x);
        } else {
            System.out.print(x % 10);
            escribirInverso(x / 10);
        }
    }

    /*
    3. Diseñe un algoritmo recursivo que dado un vector de caracteres, devuelva verdadero si el
    vector contiene una palabra palíndrome
     */
    public static boolean esPalindrome(String cadena) {
        int tam = cadena.length();

        if (tam <= 1) {
            return true;
        }
        else {
            if (cadena.charAt(0) == cadena.charAt(tam-1)) {
                return esPalindrome(cadena.substring(1,tam-1));
            }
            else{
                return false;
            }
        }
    }
}
