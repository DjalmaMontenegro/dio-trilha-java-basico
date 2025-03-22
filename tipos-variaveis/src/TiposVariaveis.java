public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
       double salarioMinimo = 2500;

       short numeroCurto = 1;
       int  numeroLongo = numeroCurto;
       numeroCurto = (short) numeroLongo;
       int numero = 10;

       System.out.println(numero);
       final double NUMERO_PI = 3.141528;
       String meuNome = "Dj Alma";
       System.out.println( meuNome);
       for (int i = 0; i < 5; i++) {
           numero = - numero;
        System.out.println( numero);
       }
        
        
    }
}
