package com.udacity.firebase.shoppinglistplusplus.model;

/**
 * Created by ibrahimhassan on 12/7/15.
 */
public class ShoppingList {
    String listName;
    String owner;

    public ShoppingList() {
    }

    public ShoppingList(String listName, String owner) {
        this.listName = listName;
        this.owner = owner;
    }

    public String getListName() {
        return listName;
    }

    public String getOwner() {
        return owner;
    }
}
