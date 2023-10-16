package br.com.honnigam.todojava.user;


public class UserModel {
  private String name;
  private String username;
  private String password;
  

  // two types atributes => (getters / setters)
  //inserir o valor
  public void setName(String name) {
    this.name = name;
  }
    //buscar o valor
  public String getName() {
    return name;
  }
    //inserir o valor
  public void setUsername(String username) {
    this.username = username;
  }
    //buscar o valor
  public String getUsername() {
    return username;
  }
    //inserir o valor
  public void setPassword(String password) {
    this.password = password;
  }
    //buscar o valor
  public String getPassword() {
    return password;
  }


}
