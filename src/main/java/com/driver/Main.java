package com.driver;

public class Main {
  public static void main(String args[]){
      RWOnly RW = new RWOnly();
      //RW.name = "Steller";  //name has private access in com.driver.RWOnly
      //System.out.println(RW.name);
      RW.setName("Steller");
      System.out.println(RW.getName());
  }
}