package co.edulabs.helpdesk.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
public class Historial {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long ticketId;
    private String estadoAnterior;
    private String estadoNuevo;
    private LocalDateTime fecha = LocalDateTime.now();
    public Historial() {}
    public Historial(Long tId, String ant, String nue) { this.ticketId = tId; this.estadoAnterior = ant; this.estadoNuevo = nue; }
    public Long getId() { return id; }
}
