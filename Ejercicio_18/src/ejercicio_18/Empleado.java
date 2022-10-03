
package ejercicio_18;

public class Empleado {
    public static double Salario_Bruto(int nhm,double vh,double rf,String cod,String name){
        double salario_bruto = nhm * vh;
        return salario_bruto;
    }
        public static double Salario_Neto(int nhm,double vh,double rf,String cod,String name){
        double salario_bruto = nhm * vh;
        double salario_neto = salario_bruto - (rf*salario_bruto);
        return salario_neto;
    }
    
}
