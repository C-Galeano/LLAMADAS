import java.util.Random;

public class LlamadaLargaDistancia extends Llamada {
    public LlamadaLargaDistancia() {
        Random rand = new Random();
        this.duracion = rand.nextInt(10) + 1;
        this.costo = this.duracion * Tarifa.LOCAL;
    }
}
