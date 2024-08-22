package br.com.todolist.user;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {

   UserModel findByusername(String username);
}
