package com.company;

public class Item {

  public String category;
  public String object;
  public boolean available;

  public Item(String category, String object){
    this.category = category;
    this.object = object;
    this.available = true;
  }

  public String getCategory() {
    return category;
  }

  public String getObject() {
    return object;
  }

  public String toString(){
    return category + " " + object + " " + available;
  }
}
