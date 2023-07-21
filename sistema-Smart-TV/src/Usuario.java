import java.io.ObjectInputFilter.Status;

public class Usuario {
    public static void main(String[] args) throws Exception {
        Smart_Tv smart_Tv = new Smart_Tv();

        smart_Tv.mudarCanal(13);
        System.out.println("Canal : " + smart_Tv.canal);
        

        smart_Tv.diminuirVolume();
        smart_Tv.diminuirVolume();
        smart_Tv.diminuirVolume();

        smart_Tv.aumentarVolume();
        smart_Tv.aumentarVolume();

        System.out.println("Volume" + smart_Tv.volume);

        System.out.println("TV Ligada: " + smart_Tv.desligada);
        System.out.println("TV Ligada: " + smart_Tv.ligada);
    
        System.out.println("Volume : " + smart_Tv.volume);



        smart_Tv.ligar();
        System.out.println("Status: " + smart_Tv.ligada);

        smart_Tv.desligar();
        System.out.println("Status: " + smart_Tv.desligada);
    }
}
