/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuentas;

/**
 *
 * @author Javier
 */
public class Deposito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola");
        System.out.println("Esto son lineas nuevas de codigo que he añadido");
        System.out.println("Para comprobar que cambia");
        operativa_cuenta(0.0);
    }

    private static void operativa_cuenta(double cantidad) {
        // TODO code application logic here
        CCuenta cuenta1;
        double saldoActual;
        
        cuenta1 = new CCuenta("Antonio Lopez", "1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual);
        
        try{
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }
        try{
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e){
            System.out.println("Fallo al ingresar");
        }
    }
    
}
