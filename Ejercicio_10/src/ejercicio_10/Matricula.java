package ejercicio_10;

public class Matricula {
    public static String Calcular_Matricula(int ES,int PAT,String NI,String NOM){
        double PAGMAT=50000;
        if ((PAT>2000000)&&(ES>3)){
           PAGMAT= PAGMAT +0.03*PAT;
           }
           return "El estudiante con numero de inscripcion "+ NI+" y nombre "+NOM+" debe pagar $"+PAGMAT;
    }
    
}
