package br.com.missio.Customer_registration.repositories;

import br.com.missio.Customer_registration.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
