package Enhance;

import java.util.Scanner;

public class Login {
  Scanner sc;
  public int login_id;
  public String password;
  public String username;

  public void setlogin_id(int login_id) {
    this.login_id = login_id;
  }

  public int getlogin_id() {
    return login_id;
  }

  public void setusername(String username) {
    this.username = username;
  }

  public String getusername() {
    return username;
  }

  public void setpassword(String password) {
    this.password = password;
  }

  public String setpassword() {
    return password;

  }

  public void display() {
    System.out.println("Login Id:" + login_id);
    System.out.println("Username:" + username);
    System.out.println("Password:" + password);
  }

  public static void main(String args[]) {

  }

}
