public class MyTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = true;
    }

    public void AumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void DiminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
}
