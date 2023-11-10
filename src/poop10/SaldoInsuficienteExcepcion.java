/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * /**
 * La clase SaldoInsuficienteExcepcion - es una excepción 
 * personalizada que se utiliza para indicar
 * que se ha intentado realizar una operación de retiro 
 * en una cuenta bancaria con saldo insuficiente
 * @author brismar
 */
public class SaldoInsuficienteExcepcion extends Exception {
     /**
     * Constructor de la clase SaldoInsuficienteExcepcion.
     * Llama al constructor de la clase base (Exception) 
     * con el mensaje "Saldo Insuficiente".
     */
    public SaldoInsuficienteExcepcion() {
        super("Saldo Insuficiente"); 
    }  
}
