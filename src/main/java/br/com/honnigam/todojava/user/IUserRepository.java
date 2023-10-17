package br.com.honnigam.todojava.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

//model of application
public interface IUserRepository extends JpaRepository<UserModel, UUID> {
  
}
