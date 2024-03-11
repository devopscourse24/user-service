package org.elfn.userinformation.repositories;

import org.elfn.userinformation.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
