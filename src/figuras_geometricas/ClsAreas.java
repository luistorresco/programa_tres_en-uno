/* tres metodos para hallar el area de un cuadrado, de un rectangulo y de un circulo*/
package figuras_geometricas;

/**
 *
 * @author luistorresco
 */
public class ClsAreas {
    
    float area; 
    
    public float calcular_area_cuadrado(float lado){
        area=lado *lado;
        return area;
        
    }
    public float calcular_area_rectangulo(float largo, float ancho){
        area= largo * ancho;
        return area; 
    }
    
    public float calular_area_circulo(float radio){
        area=(float)Math.PI * radio *radio;
        return area;
    }
}
