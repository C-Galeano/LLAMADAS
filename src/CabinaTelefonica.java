import java.util.*;

public class CabinaTelefonica {
    private int id;
    private List<Llamada> llamadas;

    public CabinaTelefonica() {
        this.llamadas = new ArrayList<>();
    }

    public CabinaTelefonica(int id) {
        this.id = id;
        this.llamadas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(List<Llamada> llamadas) {
        this.llamadas = llamadas;
    }

    public void registrarLlamadaPorTipo(String tipo) {
        Llamada llamada;
        Random rand = new Random();
        int duracion = rand.nextInt(10) + 1;

        switch (tipo.toLowerCase()) {
            case "local":
                llamada = new LlamadaLocal();
                break;
            case "larga distancia":
                llamada = new LlamadaLargaDistancia();
                break;
            case "celular":
                llamada = new LlamadaCelular();
                break;
            default:
                System.out.println("Tipo de llamada no válido.");
                return;
        }
        this.llamadas.add(llamada);
        System.out.println("Llamada registrada en cabina #" + id + ": " + llamada);
    }

    // Método para mostrar la información de la cabina
    public void obtenerInfo() {
        int totalLlamadas = llamadas.size();
        int totalDuracion = 0;
        double totalCosto = 0;

        for (Llamada llamada : llamadas) {
            totalDuracion += llamada.getDuracion();
            totalCosto += llamada.getCosto();
        }

        System.out.println("Cabina #" + id);
        System.out.println("Total de llamadas: " + totalLlamadas);
        System.out.println("Duración total: " + totalDuracion + " minutos");
        System.out.println("Costo total: $" + totalCosto);
        System.out.println("----------------------");
    }

    public void reiniciar() {
        this.llamadas.clear();
        System.out.println("Cabina #" + id + " reiniciada con éxito.");
    }

    @Override
    public String toString() {
        return "CabinaTelefonica{" +
                "id=" + id +
                ", llamadas=" + llamadas +
                '}';
    }
}
