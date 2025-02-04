package com.example.auth.repository;

import com.example.auth.entities.Role;
import com.example.auth.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    Optional<User> findByEmail(String email);
    List<User> findByRole(Role role);
}
