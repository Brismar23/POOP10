/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 * Clase Principal POOP10
 * @author brismar
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Imprimer en pantalla ·Hola Mundo·
         */
        System.out.println("Hola Mundo");
        /**
         * Se inicializa un array de Strings llamado "mensajes".
         */
        String [] mensajes = {"Primero","Segundo","Tercero"};
        
        /**
         * Intenta acceder a elementos del array "mensajes" en un bucle for.
         * Captura y maneja la excepción ArrayIndexOutOfBoundsException si ocurre.
         */
        try{
            for(int i=0; i<=3; i++){
                System.out.println("mensajes = "+mensajes[i]);               
            }            
        }catch(ArrayIndexOutOfBoundsException e){
            /**
             * Imprime un mensaje de error y la descripción de la excepción.
             */ 
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
        /**
         * Imprimer en pantalla ·Hola Mundo 2·
         */
        System.out.println("Hola Mundo 2");

        /**
         * Intenta realizar una división por cero y captura y maneja la 
         * excepción
         * ArithmeticException. También se captura cualquier otra excepción 
         * general.
         * Imprime mensajes de error y la traza de la excepción en caso de 
         * fallo.
         * El bloque "finally" se ejecutará siempre, independientemente de 
         * si hay una excepción o no.
        */
        try{
            double x = 0f/0;
            System.out.println(x);    
        }catch(ArithmeticException e){
            /**
             * Imprime un mensaje de error y la descripción de la excepción.
             */ 
            System.out.println("Error");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch(Exception e){
            /**
             * Imprime un mensaje de error y la descripción de la excepción.
             */ 
            System.out.println("Error");
            System.out.println(e.getMessage());
        }finally{
            System.out.println("El bloque finally siempre se ejecuta");
        }
        /**
         * Imprimer en pantalla ·Hola Mundo 3·
         */
        System.out.println("Hola Mundo 3");
        
         /**
         * Intenta llamar al método privado "metodoDivision" y captura la excepción
         * UnsupportedOperationException si ocurre.
         */
        try{ 
            double division = metodoDivision(4f, 6.0);
        }catch(UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
    }
    /**
     * Método privado que lanza una excepción UnsupportedOperationException.
     * @param f Número flotante.
     * @param d Número doble .
     * @return Nunca se rtorna, ya que el método lanza una excepción.
     */
    private static double metodoDivision(float f, double d) {
        throw new UnsupportedOperationException("Operacion NO soportada"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }             
}
