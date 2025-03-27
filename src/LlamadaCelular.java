import java.util.Random;

public class LlamadaCelular extends Llamada {
    public LlamadaCelular() {
        Random rand = new Random();
        this.duracion = rand.nextInt(10) + 1;
        this.costo = this.duracion * Tarifa.LOCAL;
    }
}
