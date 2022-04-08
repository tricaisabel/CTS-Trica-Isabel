package clase;

public class Facade {

    public static void deschideUsi(Autobuz autobuz){
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
        System.out.println();
    }

    public static void inchideUsi(Autobuz autobuz){
        autobuz.inchideUsaFata();
        autobuz.inchideUsaMijloc();
        autobuz.inchideUsaSpate();
        System.out.println();
    }
}
