package Examen_Guano_Ariel;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float sumatoriaDistancias = 0;
        Punto punto = new Punto();
        System.out.print("Ingrese la cantidad de movimientos: ");
        int movimientos = sc.nextInt();
        Coordenadas cor[] = new Coordenadas[movimientos]; //Arreglo donde se guardan las coordenadas para la distancia
        for(int i = 0; i < movimientos; i++){
            System.out.println("Ingrese la cantidad de movimiento n " + (i+1)+" :");
            int cantidad = sc.nextInt();
            punto.setAzarCoordenadas(cantidad);
            cor[i] = new Coordenadas(punto.getX(), punto.getY());
            System.out.println(punto.mostrarCoordenadas());
        }
        
        System.out.println("La distancia total recorrida por el punto en el plano es: " + calcularDistancia(cor,movimientos - 1));
    }
    
    public static double calcularDistancia(Coordenadas c[], int n){
        double distancia = 0;
        double suma = 0;
        for(int i = 0; i < n; i++){
            Coordenadas siguiente = c[i + 1];
            distancia = Math.sqrt(Math.pow(c[i].getX() - siguiente.getX(), 2) + Math.pow(c[i].getY() - siguiente.getY(), 2));
            suma += distancia;
        }
        return suma;
    }   
}
