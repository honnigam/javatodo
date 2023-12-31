package br.com.honnigam.todojava.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data  /* - LIB:Lombok - @Data / @Getters / @Setters */
@Entity(name = "table_users") //na aplicação: conhecido como user ; no db: table
public class UserModel {

  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;

  private String name;
  @Column(unique = true)
  private String username;
  private String password;

  @CreationTimestamp
  private LocalDateTime createAt;

}
