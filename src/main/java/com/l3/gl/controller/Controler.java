package com.l3.gl.controller;

import com.l3.gl.model.Product;
import com.l3.gl.model.User;
import com.l3.gl.view.Ui;

public class Controler {

    private Ui view;
    private Product product;
    private User user;

    public Controler(Product product, User user) {
        this.product = product;
        this.user = user;
    }

    public String sayHello() {
        return "hello from controller";
    }

    private void showDetails() {
        // your work
    }
}
