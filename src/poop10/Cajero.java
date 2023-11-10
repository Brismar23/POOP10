/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * Clase Cajero
 * @author brismar
 */
public class Cajero {
    public static void main(String[] args){
        /**
         * Se realiza una serie de operaciones en unainstancia de la clase 
         * cuenta
         */
        CuentaBancaria cuenta = new CuentaBancaria();
        /**
         * Operaciones dentro del bloque try, intentando realizar 
         * operaciones de depósito,
         * retiro y obtener el saldo de la cuenta.
         */
        try{
            cuenta.depositar(2000);
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.depositar(200);
            cuenta.retirar(100);
        /**
         * Manejo de excepciones 'catch'. Captura y maneja la 
         * excepción SaldoInsuficienteExcepcion.
         */   
        }catch (SaldoInsuficienteExcepcion e){ 
            /**
             * Imprime la excepción en pantalla.
             */
            e.printStackTrace();
        }
    }    
}
