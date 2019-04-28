package com.inguarus.MySpringBoot.repository;

import com.inguarus.MySpringBoot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
