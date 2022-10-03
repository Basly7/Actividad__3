package ejercicio_19;

public class Triangulo_Equilatero {
       
        
        
        public static double Calcular_Perimetro(double lado){
        double per = lado * 3;
        return per;
        }
        public static double Caclular_Altura(double lado){
        double altura = (lado*Math.sqrt(3))/2;
        return altura;
        }
        public static double Caclular_Area(double lado){
        double area=(Math.pow(lado,2)*Math.sqrt(3))/4;
        return area;       
        } 
}
