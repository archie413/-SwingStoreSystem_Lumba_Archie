/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package storemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StoreManagementSystem {

    // --- Array-Based Data Storage ---
    public static final int TOTAL_PRODUCTS = 4;
    public static String[] itemNames = {"Rice", "Sugar", "Coffee", "Milk"};
    public static double[] itemPrices = {500.0, 50.0, 90.0, 1000.0};
    public static int[] stockLevels = {20, 20, 20, 20}; // Initial stock [cite: 98]

    // --- Array-Based Transaction Logs ---
    public static final int LOG_LIMIT = 100;
    public static String[] logItems = new String[LOG_LIMIT];
    public static int[] logQuantities = new int[LOG_LIMIT];
    public static double[] logSubtotals = new double[LOG_LIMIT];

    // Counter to track the index of transactions
    public static int totalTransactions = 0;

    public static void main(String[] args) {

        // Launch the Store Transaction Frame directly
        SwingUtilities.invokeLater(() -> {
            new StoreTransactionFrame().setVisible(true);
        });
    }

}
