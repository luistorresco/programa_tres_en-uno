/* hacer un programa que mediante dos clases y funciones imprima el area 
y el perimeto de un cuadrado, un triangulo , y un cirtulo 

 */
package figuras_geometricas;

import java.util.Scanner;

/**
 *
 * @author luistorresco
 */
public class Figuras_geometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        ClsAreas obj_areas=new ClsAreas();
        float lado, largo, ancho, radio, area;
        //datos de entrada 
        System.out.println("digite el lado del cuadrado");
        lado=objread.nextFloat();
        //hallar el lado del cuadrado 
        area=obj_areas.calcular_area_cuadrado(lado);
        System.out.println("el area del cuadrado es "+ area);
        System.out.println("digite el largo del rectangulo");
        largo=objread.nextFloat();
        System.out.println("digite el ancho del rectangulo");
        ancho=objread.nextFloat();
        area=obj_areas.calcular_area_rectangulo(largo, ancho);
        System.out.println("el area del rectangulo es " + area);
        System.out.println("ingrese el radio del circulo");
        radio=
    }
    
}
