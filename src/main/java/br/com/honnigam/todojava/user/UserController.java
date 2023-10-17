package br.com.honnigam.todojava.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* 
 * Modificador
    * public 
    * private
    * protected
 */

@RestController
@RequestMapping ("/users")
public class UserController {
  
  @Autowired //lifecycle
  private IUserRepository userRepository;
  //escopo de acesso
   /*
    * String
    * Integer (int) numeros inteiros
    * Double (double) numeros 0.00000
    * Float (float) numeros 0.000
    * char (A C D) - caracteres
    * Date (data) 
    * void - não tem retorno, só executa a lógica
   */ 

   /*
    * A REQ vem direto do body
    */
  @PostMapping("/")
  public ResponseEntity create(@RequestBody UserModel userModel) {
      var user = this.userRepository.findByUsername(userModel.getUsername());
      
      if (user != null) {
        //Error menssage
        //Status code
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já existe!");
      }

      var userCreated = this.userRepository.save(userModel);
      return ResponseEntity.status(HttpStatus.CREATED).body(userCreated); 
  }
}
