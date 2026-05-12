package co.edulabs.helpdesk.service;
import co.edulabs.helpdesk.model.*;
import co.edulabs.helpdesk.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class TicketService {
    @Autowired private TicketRepository tr;
    @Autowired private HistorialRepository hr;
    public Ticket crearConIA(Ticket t) {
        if (t.getDescripcion().toLowerCase().contains("urgente")) t.setPrioridad("ALTA");
        else t.setPrioridad("BAJA");
        return tr.save(t);
    }
    public List<Ticket> listar() { return tr.findAll(); }
    public Ticket cambiarEstado(Long id, String ne) {
        Ticket t = tr.findById(id).orElseThrow();
        hr.save(new Historial(id, t.getEstado(), ne));
        t.setEstado(ne);
        return tr.save(t);
    }
}
