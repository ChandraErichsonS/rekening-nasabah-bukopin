package My.Spring.Application.repository;

import My.Spring.Application.model.NasabahBukopin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NasabahRepository extends JpaRepository<NasabahBukopin, Long> {
    }