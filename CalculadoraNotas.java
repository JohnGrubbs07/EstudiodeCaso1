/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.notas;

/**
 *
 * @author John Paul
 */
public class CalculadoraNotas {
    public static void main(String[] args) {
        int cantidadEstudiantes = 3;
        double[] notas = {85.5, 92.0, 67.5};

        double notaTotal = 0, notaMayor = 0, notaMenor = 100;
        int estudiantesAprobados = 0;
        
        for (double nota : notas) {
            notaTotal += nota;
            
            if (nota > notaMayor)
                notaMayor = nota;
            
            if (nota < notaMenor)
                notaMenor = nota;
            
            if (nota >= 70)
                estudiantesAprobados++;
        }
        
        double notaPromedio = notaTotal / cantidadEstudiantes;
        
        System.out.println("Nota promedio: " + notaPromedio);
        System.out.println("Nota mayor: " + notaMayor);
        System.out.println("Nota menor: " + notaMenor);
        System.out.println("Cantidad de estudiantes aprobados: " + estudiantesAprobados);
    }
}
