package ru.skypro;

public class Main {

    public static void main(String[] args) {
        String splitStr = "Код должен работать для строк любого размера и любого содержания";
        String[] words = splitStr.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
