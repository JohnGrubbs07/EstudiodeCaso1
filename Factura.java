/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudio.de.caso;

/**
 *
 * @author LABORATORIO 04
 */
public class Factura {
    private String cliente;
    private String cedula;
    private int numeroFactura;
    private int mes;
    private int year;
    private double monto;
    
    public Factura (String cliente, String cedula, int numeroFactura, int mes, int year, double monto){
        this.cliente = cliente;
        this.cedula = cedula;
        this.numeroFactura = numeroFactura;
        this.mes = mes;
        this.year = year;
        this.monto = monto;
   
    }     

    Factura(String antonio_del_monte_Quemado, String string, int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
public double getMonto(){
    return monto;
}
}
