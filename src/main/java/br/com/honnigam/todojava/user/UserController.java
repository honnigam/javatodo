package br.com.honnigam.todojava.user;

import org.springframework.beans.factory.annotation.Autowired;
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
  public UserModel create(@RequestBody UserModel userModel) {
      var userCreated = this.userRepository.save(userModel);
      return userCreated; 
  }
}
