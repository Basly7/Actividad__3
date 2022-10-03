package ejercicio_23;

public class Ecuacion {
    public static String Calcular_parametros(double A,double B,double C){
        // metodo
        double x1 = (-B + Math.sqrt((Math.pow(B, 2)) - (4 * A * C))) / (2 * A);
        double x2 = (-B - Math.sqrt((Math.pow(B, 2)) - (4 * A * C))) / (2 * A);
        return "La raíz X1 = " + Math.round(x1) + " y la raíz X2 = " + Math.round(x2);
    }
    
}
