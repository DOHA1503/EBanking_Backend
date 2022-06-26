package doha.elachgar.ebancking_backend.repositories;

import doha.elachgar.ebancking_backend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
