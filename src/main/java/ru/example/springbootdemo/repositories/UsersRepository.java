package ru.example.springbootdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.example.springbootdemo.models.User;

public interface UsersRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
