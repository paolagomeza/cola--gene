public class Prueba{
    public static void main(String[] args) {
        double num =0;
        ColaGenerica<Double> CI = new ColaGenerica(3);
        try{
            System.out.println("AGREGAMOS 5.5");
            CI.encolar(5.5);
            System.out.println("AGREGAMOS 14.57");
            CI.encolar(14.57);
            // Sacar Numero
            num = CI.sacar();
            System.out.println("SACAMOS "+num);
            num = CI.sacar();
            System.out.println("SACAMOS "+num);
            System.out.println("AGREGAMOS 7.6");
            CI.encolar(7.6);
        }catch(ExcepcionColaLlena Err){
            System.out.println(Err.getMessage());
        }catch(ExcepcionColaVacia Err){
            System.out.println(Err.getMessage());
        }
        /////////////////////////////////////////////////////////////////////////
        System.out.println("=============================================");
        ColaGenerica<String> CS = new ColaGenerica(3);
        String Palabra="";
        try{
            System.out.println("AGREGAMOS MAMA");
            CS.encolar("hola");
            System.out.println("AGREGAMOS HOlA");
            CS.encolar("Mundo");
            // Sacar Texto
            Palabra = CS.sacar();
            System.out.println("SACAMOS "+ Palabra);
            Palabra = CS.sacar();
            System.out.println("SACAMOS "+ Palabra);
            System.out.println("AGREGAMOS Estructura");
            CS.encolar("Estructura de Datos");
        }catch(ExcepcionColaLlena Err){
            System.out.println(Err.getMessage());
        }catch(ExcepcionColaVacia Err){
            System.out.println(Err.getMessage());
        }
        /////////////////////////////////////////////////////////////////////////
        System.out.println("=============================================");
        ColaGenerica<Estudiante> CE = new ColaGenerica(3);
        try{
            Estudiante e1,e2,e3;
            e1 = new Estudiante("18590242","Paola","Sistemas",(byte)4);
            e2 = new Estudiante("18594444","Maria","Sistemas",(byte)8);
            System.out.println("AGREGAMOS "+ e1);
            CE.encolar(e1);
            System.out.println("AGREGAMOS "+ e2);
            CE.encolar(e2);
            // Sacar Numero
            Estudiante Ref1 =CE.sacar();
            System.out.println("SACAMOS "+Ref1);
            Estudiante Ref2 =CE.sacar();
            System.out.println("SACAMOS "+Ref2);
            e3 = new Estudiante("18799685","Estudiante","Industrial",(byte)3);
            System.out.println("AGREGAMOS "+e3);
            CE.encolar(e3);
        }catch(ExcepcionColaLlena Err){
            System.out.println(Err.getMessage());
        }catch(ExcepcionColaVacia Err){
            System.out.println(Err.getMessage());
        }
    }
}
