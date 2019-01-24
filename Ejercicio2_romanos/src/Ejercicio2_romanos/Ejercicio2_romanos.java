
package Ejercicio2_romanos;

import java.util.Scanner;

public class Ejercicio2_romanos {

    public static void main(String[] args) {
        
        int numero;
        int centenas;
        int decenas;
        int unidades;
        int opcion;
        
        do{
        Scanner entrada =  new Scanner (System.in); 
        System.out.println("Ingrese un Numero: ");
        numero = entrada.nextInt();
        
        if(numero == 1000){ System.out.println("El Número Romano Es: M");}
        
        else{
        centenas = numero/100;
        decenas = (numero-(centenas * 100))/10;
        unidades = numero - (centenas*100 + decenas*10);
            System.out.print("El Número Romano Es: ");
        switch(centenas){
            case 1 : System.out.print("C");
            break;
            case 2 : System.out.print("CC");
            break;
            case 3 : System.out.print("CCC");
            break;
            case 4 : System.out.print("CD");
            break;
            case 5 : System.out.print("D");
            break;
            case 6 : System.out.print("DC");
            break;
            case 7 : System.out.print("DCC");
            break;
            case 8 : System.out.print("DCCC");
            break;
            case 9 : System.out.print("CM");
            break;
        }
        switch(decenas){
            case 1 : System.out.print("X");
            break;
            case 2 : System.out.print("XX");
            break;
            case 3 : System.out.print("XXX");
            break;
            case 4 : System.out.print("XL");
            break;
            case 5 : System.out.print("L");
            break;
            case 6 : System.out.print("LX");
            break;
            case 7 : System.out.print("LXX");
            break;
            case 8 : System.out.print("LXXX");
            break;
            case 9 : System.out.print("XC");
            break;
        } 
        switch(unidades){
            case 1 : System.out.print("I");
            break;
            case 2 : System.out.print("II");
            break;
            case 3 : System.out.print("III");
            break;
            case 4 : System.out.print("IV");
            break;
            case 5 : System.out.print("V");
            break;
            case 6 : System.out.print("VI");
            break;
            case 7 : System.out.print("VII");
            break;
            case 8 : System.out.print("VIII");
            break;
            case 9 : System.out.print("IX");
            break;
        }
        
        System.out.println(" ");  
            }
            Scanner entrada1 = new Scanner(System.in);
            System.out.println("¿Realizar Otra Conversión?");
            System.out.println("1) Si 0) No");
            opcion = entrada.nextInt();
        } while(opcion  == 1);
        }     
    }
    

