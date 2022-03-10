package com.company;

public class Catalogue {
  private int catalogueSize;

  //Create a Class array from Item as a Class is also a datatype
  private  Item[] catalogue = new Item[catalogueSize];


  public Catalogue(int size){
    catalogueSize = size;
  }

  public void setCatalogueSize(int catalogueSize) {
    this.catalogueSize = catalogueSize;
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
