package SegurityConfig.done_AngeloJoseAgurto.repository;


import SegurityConfig.done_AngeloJoseAgurto.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
