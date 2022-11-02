package src.src.SmartTV;

public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTv = new SmartTV();

        smartTv.ligar();
        System.out.println("Status: " + smartTv.ligada);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.desligar();
        System.out.println("Status: " + smartTv.ligada);
    }
}