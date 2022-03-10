package com.company;

public class Item {

  public String category;
  public String name;
  public boolean available;

  public Item(String category, String object){
    this.category = category;
    this.name = object;
    this.available = true;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }

  public boolean isAvailable() {
    return available;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean checkForItem(Item item){
    if (this.name.equals(item.name)){
      return true;
    }return false;
  }

  public String toString(){
    return name + " " + category + " " + available;
  }
}