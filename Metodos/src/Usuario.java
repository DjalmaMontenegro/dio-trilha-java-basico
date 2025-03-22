public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();
       
       System.out.println("Tv está ligada? " + smartTv.ligada);
       System.out.println("Qual canal? " + smartTv.canal);
       System.out.println("Qual volume? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv está ligada? " + smartTv.ligada);
        System.out.println(" ");
        smartTv.desligar();
        System.out.println("Tv está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Qual volume? " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Qual volume? " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Qual volume? " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Qual volume? " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Qual volume? " + smartTv.volume);

    }
}
