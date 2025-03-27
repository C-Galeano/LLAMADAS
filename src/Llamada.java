public class Llamada {
    protected int duracion;
    protected double costo;

    public Llamada() {
    }

    public Llamada(int duracion, double costo) {
        if (duracion < 0) duracion = 0;
        if (costo < 0) costo = 0;
        this.duracion = duracion;
        this.costo = costo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if (duracion >= 0) {
            this.duracion = duracion;
        }
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        if (costo >= 0) {
            this.costo = costo;
        }
    }

    public void calcularCosto() {
    }

    @Override
    public String toString() {
        return "Llamada{" +
                "duracion=" + duracion +
                ", costo=" + costo +
                '}';
    }
}
