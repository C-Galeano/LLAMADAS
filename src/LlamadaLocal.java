import java.util.Random;

public class LlamadaLocal extends Llamada {
    public LlamadaLocal() {
        Random rand = new Random();
        this.duracion = rand.nextInt(10) + 1; // Duración aleatoria entre 1 y 10 minutos
        this.costo = this.duracion * Tarifa.LOCAL;
    }
}
