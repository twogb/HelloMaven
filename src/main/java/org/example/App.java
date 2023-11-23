package org.example;

import com.google.gson.*;

import java.util.HashMap;


public class App {
    public static void main(String[] args) {
        String nameSurname = "{\"name\": \"Svetlana\", \"lastName\": \"Dubynka\"}";
        HashMap<String, String> gson = new Gson().fromJson(nameSurname, HashMap.class);
        System.out.println(gson);
    }
    
}
