Swing Store System

A lightweight, desktop-based Store Management System built using Java Swing. This application provides a classic, easy-to-navigate graphical user interface (GUI) designed to help small businesses efficiently manage their store operations, from tracking inventory to processing sales and auditing transactions.

System Overview

The "Swing Store System" is a standalone Java application tailored for retail management. It centralizes core business tasks into a cohesive desktop environment. The system allows users to seamlessly navigate between managing their product catalog, checking out customers at a point-of-sale (POS), and reviewing past transaction history. By utilizing Java Swing for the frontend, it ensures a responsive and intuitive user experience while maintaining robust data handling behind the scenes to keep inventory and sales records accurate and up-to-date.

Frame Responsibilities

The application is modularized into distinct Java `JFrame` classes, each handling a specific operational domain:

StoreManagementSystem.java
  Role: The main entry point and central hub of the application.
  Responsibility: It initializes the program, sets up the primary dashboard/menu, and orchestrates navigation. It acts as the controller that opens and manages the lifecycle of the other functional frames.

InventoryFrame.java
  Role: The product management dashboard.
  Responsibility:** Provides the interface for users to perform CRUD (Create, Read, Update, Delete) operations on the store's inventory. Users can add new products, update pricing and stock quantities, remove discontinued items, and monitor real-time stock levels. 

StoreTransactionFrame.java
  Role: The Point-of-Sale (POS) interface.
    Responsibility: Handles active sales and customer checkouts. It allows the cashier to select items from the inventory, specify purchase quantities, and calculate subtotals/totals. Once a transaction is finalized, this frame communicates with the inventory to deduct the sold stock.

TransactionLogsFrame.java
  Role: The auditing and historical records viewer.
  Responsibility: Displays a comprehensive history of all completed sales. It serves as a ledger for management to review past transactions, analyze sales data, and verify previous checkout details.

How Arrays are Used?

Arrays (and dynamic array structures like `ArrayList`) form the backbone of local data manipulation and GUI rendering within this application:

1. Populating UI Tables (`JTable`)
   Two-dimensional arrays (e.g., `Object[][]`) or Vectors are used extensively to structure data for `JTable` models. In the `InventoryFrame` and `TransactionLogsFrame`, arrays hold row and column data (such as Product ID, Name, Price, Stock, Date) so it can be dynamically rendered and updated on the screen.

2. Temporary Cart Storage
   Inside the `StoreTransactionFrame`, arrays or `ArrayList`s temporarily hold the items currently in a customer's cart. This allows the system to easily iterate through the cart to calculate total costs, apply changes, and bulk-update the main inventory array once the checkout is confirmed.

3. In-Memory Data Management
   Arrays act as a fast, in-memory cache for storing product objects and transaction records retrieved from the database or flat files. This enables quick search functionality, sorting, and data retrieval without needing to constantly query the backend storage. 

Getting Started

Prerequisites
Java Development Kit (JDK): Version 8 or higher.
IDE: NetBeans, Eclipse, or IntelliJ IDEA.

Installation
1. Clone the repository:
   ```bash
   git clone [https://github.com/archie413/-SwingStoreSystem_Lumba_Archie.git](https://github.com/archie413/-SwingStoreSystem_Lumba_Archie.git)
 build/ - Compiled class files.
 lib/ - External libraries (like JDBC drivers).
 
2. Open the project in your preferred Java IDE (NetBeans recommended).
   
3. Compile and run StoreManagementSystem.java to launch the application.
