package com.company;

public class Catalogue {

  //Create an array that can hold Item (Item Class)
  private Item[] catalogue;


  public Catalogue(int size) {
    catalogue = new Item[size];
  }

  public Item[] getFullList() {
    return catalogue;
  }

  public Item[] getAvailableItems() {
    int i = 0;
    Item[] availableCatalogue = new Item[catalogue.length];
    for (int x = 0; x < catalogue.length; x++) {
      if (catalogue[x] == null) {
        break;
      }
      if (catalogue[x].available) {
        availableCatalogue[i] = catalogue[x];
        i++;
      }
    }
    return availableCatalogue;
  }

  public Item findItem(String description) {
    for (int x = 0; x < catalogue.length; x++) {
      if (catalogue[x].name.equals(description)) {
        return catalogue[x];
      }
    }
    return null;
  }

  public void borrowItem(Item item) {
    item.setAvailable(false);
  }

  public void returnItem(Item item) {
    item.setAvailable(true);
  }

  public void addItem(Item item) {
    for (int x = 0; x < catalogue.length; x++) {
      if (catalogue[x] == null) {
        catalogue[x] = item;
        return;
      }
    }
  }
}
