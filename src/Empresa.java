import java.util.*;

public class Empresa {
    private List<CabinaTelefonica> cabinas;

    public Empresa() {
        this.cabinas = new ArrayList<>();
    }

    public List<CabinaTelefonica> getCabinas() {
        return cabinas;
    }

    public void setCabinas(List<CabinaTelefonica> cabinas) {
        this.cabinas = cabinas;
    }

    public void agregarCabina(int id) {
        cabinas.add(new CabinaTelefonica(id));
    }

    public CabinaTelefonica obtenerCabina(int id) {
        for (CabinaTelefonica cabina : cabinas) {
            if (cabina.getId() == id) {
                return cabina;
            }
        }
        return null;
    }

    public void obtenerConsolidado() {
        int totalLlamadas = 0;
        int totalDuracion = 0;
        double totalCosto = 0;

        for (CabinaTelefonica cabina : cabinas) {
            for (Llamada llamada : cabina.getLlamadas()) {
                totalLlamadas++;
                totalDuracion += llamada.getDuracion();
                totalCosto += llamada.getCosto();
            }
        }

        System.out.println("Consolidado General:");
        System.out.println("Total de llamadas: " + totalLlamadas);
        System.out.println("Duración total: " + totalDuracion + " minutos");
        System.out.println("Costo total: $" + totalCosto);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "cabinas=" + cabinas +
                '}';
    }
}
