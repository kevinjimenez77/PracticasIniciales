package com.company;

import com.google.gson.Gson;

import java.io.Serializable;

public class Main implements Serializable {
        public static void main (String[] args) {
        Config config = new Config();
        Menu menu = new Menu();
        config.LoadConfig();
        menu.MenuIniciarSesionView();
    }
}
