package br.com.honnigam.todojava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstRoute") // Estruturar a rota
//http://localhost:8080/-------
public class firstController {
 
   /* Métodos de acessos do HTTP 
    * GET - Buscar uma informação 
    * POST - Adicionar um dado/informação
    * PUT - Alterar um dado/informação
    * DELETE - Remover um dado/informação
    * PATCH - Alterar somente uma parte do dado/informação
    */

  // Método (Funcionalidade) de uma classe
  @GetMapping("/firstMethod") //Caminho da rota criada
  public String firstMessage() {
    return "olá mundo!";
  }
}