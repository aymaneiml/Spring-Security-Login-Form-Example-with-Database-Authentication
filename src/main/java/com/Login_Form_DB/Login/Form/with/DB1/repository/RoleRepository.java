package com.Login_Form_DB.Login.Form.with.DB1.repository;

import com.Login_Form_DB.Login.Form.with.DB1.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
