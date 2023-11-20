/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newremidial;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NewRemidial {

    // Database sederhana untuk menyimpan informasi login
    private static Map<String, String> userDatabase = new HashMap<>();

    public static void main(String[] args) {
        // Menambahkan beberapa pengguna ke dalam database
        userDatabase.put("username", "password");

        // Memulai proses login
        performLogin();
    }

    private static void performLogin() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang! Silakan login.");

        // Meminta input username
        System.out.print("Username: ");
        String username = scanner.nextLine();

        // Meminta input password
        System.out.print("Password: ");
        String password = scanner.nextLine();

        // Memeriksa keberhasilan login
        if (checkLogin(username, password)) {
            System.out.println("Login berhasil! Selamat datang, " + username + ".");
        } else {
            System.out.println("Login gagal. Silakan coba lagi.");
            performLogin(); // Jika login gagal, ulangi proses login
        }
    }

    private static boolean checkLogin(String username, String password) {
        // Memeriksa apakah username ada dalam database
        if (userDatabase.containsKey(username)) {
            // Memeriksa apakah password sesuai dengan yang tersimpan dalam database
            return userDatabase.get(username).equals(password);
        } else {
            return false; // Jika username tidak ditemukan
        }
    }
}

