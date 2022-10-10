package engine.repo;

import engine.model.Complete;
import engine.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompleteRepository extends JpaRepository<Complete, Long> {
    Page<Complete> findAllByUserOrderByIdDesc(User user, Pageable pageable);
}