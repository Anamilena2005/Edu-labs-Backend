package co.edulabs.helpdesk.controller;
import co.edulabs.helpdesk.model.Ticket;
import co.edulabs.helpdesk.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/tickets")
@CrossOrigin(origins = "*")
public class TicketController {
    @Autowired private TicketService s;
    @PostMapping public Ticket crear(@RequestBody Ticket t) { return s.crearConIA(t); }
    @GetMapping public List<Ticket> listar() { return s.listar(); }
    @PutMapping("/{id}/estado") public Ticket up(@PathVariable Long id, @RequestParam String e) { return s.cambiarEstado(id, e); }
}
