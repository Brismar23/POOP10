/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * Clase de CuentaBancaria
 * @author brismar
 */
public class CuentaBancaria {
    /**
     *Variable para almacenar el saldo de la cuenta de tipo double privado
     */
    private double saldo;
    /**
     * Constructor vacio 
     */
    public CuentaBancaria() {
    }
    /**
     * Métodos de Servicio
     * Realiza un depósito en la cuenta sumando el monto proporcionado al saldo.
     * @param monto Monto a depositar en la cuenta.
     */
    public void depositar(double monto){
        System.out.println("Depositando" + monto);
        saldo += monto;
    }
    /**
     * Intenta realizar un retiro de la cuenta restando el monto proporcionado
     * al saldo.
     * Si el saldo es insuficiente, lanza una excepción del tipo 
     * SaldoInsuficienteExcepcion.
     * @param monto Monto a retirar de la cuenta.
     * @throws SaldoInsuficienteExcepcion Excepción lanzada cuando el s
     * aldo es insuficiente.
     */
    public void retirar(double monto)throws SaldoInsuficienteExcepcion{
        System.out.println("Retirando "+ monto);
        if(saldo < monto)
            throw new SaldoInsuficienteExcepcion();
        else
            saldo -=monto;
    }
    /**
     * Métodos Objetivos
     * Se obtiene el saldo actual de la cuenta.
     * @return Saldo actual de la cuenta.
     */
    public double getSaldo(){
        return saldo;
    }    
    /**
     * Método sin implementación que podría ser utilizado para
     * lanzar una excepción específica
     * relacionada con un saldo insuficiente.
     */
    void getSaldoInsuficienteExcepcion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
