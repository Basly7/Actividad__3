package ejercicio_22;

public class Salarios {
    public static String Calcular_Salario(double sh,double nht,String nombres){
      
        double salario = sh * nht;
	if (salario > 450000) {
            return ("Nombre: " + nombres+ "  Salario mensual: $" + salario);
           }
	else {
            return("Nombre: " + nombres);
                }
    }
}
