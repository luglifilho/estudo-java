public class User {
    public static void main(String[] args) throws Exception {

        MyTv myTv = new MyTv();

        System.out.println("TV ligada ? " + myTv.ligada);
        System.out.println("Canal Atual ?  " + myTv.canal);
        System.out.println("Voulme Atual ? " + myTv.volume);

        myTv.mudarCanal(13);
        myTv.AumentarVolume();
        myTv.AumentarVolume();
        myTv.desligar();

        System.out.println("TV ligada ? " + myTv.ligada);
        System.out.println("Canal Atual ?  " + myTv.canal);
        System.out.println("Voulme Atual ? " + myTv.volume);

    }

}
