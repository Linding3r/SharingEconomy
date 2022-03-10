package com.company;

public class Catalogue {

  //Create a Class array from Item as a Class is also a datatype
  private  Item[] catalogue;


  public Catalogue(int size){
    catalogue = new Item[size];
  }

  public Item[] getFullList() {
    return catalogue;
  }

  public void addItem(Item item){
    for(int x = 0; x < catalogue.length; x++){
      if (catalogue[x] == null){
        catalogue[x] = item;
      }
    }
  }


}
