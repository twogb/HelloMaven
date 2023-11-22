package org.example;
import com.google.gson.*;

import java.util.Currency;
import java.util.HashMap;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        String nameSurname = "{\"name\": \"Svetlana\", \"lastName\": \"Dubynka\"}";
        HashMap<String, String> gson = new Gson().fromJson(nameSurname, HashMap.class);
        System.out.println(gson);
    }
    
}
