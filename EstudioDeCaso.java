
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudio.de.caso;

/**
 *
 * @author LABORATORIO 04
 */
public class EstudioDeCaso {

    private static String[] nombresMeses;
    private static String i;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Factura factura1 = new Factura("Antonio del monte Quemado", "11903344", 2351, 1, 15000);
    Factura factura2 = new Factura("Antonio del monte Quemado", "11903344", 2546, 2, 25000);
    Factura factura3 = new Factura("Antonio del monte Quemado", "11903344", 2700, 3, 35000);
    Factura factura4 = new Factura("Antonio del monte Quemado", "11903344", 2810, 4, 5000);
    Factura factura5 = new Factura("Antonio del monte Quemado", "11903344", 2912, 5, 20000);
    
    double deudaTotal = 0.0;
    for (Factura factura : new Factura[] {factura1, factura2, factura3, factura4, factura5}){
        deudaTotal += factura.getMonto();
        
    }
    System.out.println("Deuda total del cliente(Cedula 11903344): $" + deudaTotal);
    
    double cuotaMensual = (deudaTotal * 0.05 + deudaTotal)/ 6;
    System.out.println("Plan de pago para el cliente (Cedula 11903344):");
    for (int 1 = 1; i++){
        String fechaPago = obtenerFechaPago(7,2023, i);
        System.out.println("Cuota " + i + " " + cuotaMensual + " Fecha de pago " + fechaPago);
     }
    
    }
    private static String obtenerFechaPago(int mesFactura, int yearFactura, int cuota) {
        int mesPago = mesFactura  + cuota;
        int yearPago = yearFactura;
        if  (mesPago < 12){
            mesPago -= 12;
            yearPago++;
            
        }
        return obtenerNombreMes(mesPago)+ " " + yearPago;
    }
    private static String obtenerNombreMes (int mes) {
        String[] nombreMeses ={"Enero", "Febrero", "Marzo", "Abril", "Mayo","Junio","Julio", "Agosto", "Setiempre", "Octubre", "Noviembre", "Diciembre"};
        return nombreMeses[mes - 1];
    }

    private static String obtenerFechaPago(int i, int i0, String i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class returm {

        public returm() {
        }
    }
}
