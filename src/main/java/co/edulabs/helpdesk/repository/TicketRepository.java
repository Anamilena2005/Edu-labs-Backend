package co.edulabs.helpdesk.repository;
import co.edulabs.helpdesk.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TicketRepository extends JpaRepository<Ticket, Long> {}
