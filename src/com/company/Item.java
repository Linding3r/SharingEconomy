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

  public void setCategory(String category) {
    this.category = category;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }

  public String getCategory() {
    return category;
  }

  public String getObject() {
    return object;
  }

  public boolean isAvailable() {
    return available;
  }

  public String toString(){
    return category + " " + object + " " + available;
  }
}
