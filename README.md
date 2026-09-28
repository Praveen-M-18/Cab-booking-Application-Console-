# 🚕 Cab Booking Application — Console Based

A console-based **Cab Booking Application** developed using **Java**.

This project is designed to practice **Low-Level Design (LLD)** concepts using Java, including classes, objects, encapsulation, collections, and object interaction.

---

## 📌 Project Overview

The Cab Booking Application allows customers to book available cabs based on:

- Customer pickup point
- Customer drop point
- Pickup time
- Cab availability
- Distance between cab and pickup point
- Cab earnings

The system finds a suitable cab and updates its location, availability time, charges, and total earnings after a booking.

---

## ✨ Features

- 🚕 Display all cabs
- ➕ Add new cabs
- 📍 Book a cab
- ⏰ Check cab availability
- 📏 Find the nearest available cab
- 💰 Calculate trip charges
- 📊 Track cab earnings
- 📍 Update cab location after a trip
- 🕐 Update cab's next available time
- 🖥️ Console-based menu-driven application

---

## 🛠️ Technologies Used

- **Java**
- **ArrayList**
- **Object-Oriented Programming (OOP)**
- **Java Collections**
- **Scanner**

---

## 📂 Project Structure

```text
Cab-Booking-Application/
│
└── src/
    └── Cab/
        ├── Main.java
        ├── Cab.java
        ├── Customer.java
        └── BookingSystem.java
```
### ⚙️ BookingSystem

The `BookingSystem` class contains the main cab booking logic.

The system:

1. Finds available cabs.
2. Calculates the distance between the cab and pickup point.
3. Selects the nearest available cab.
4. If multiple cabs have the same distance, compares their earnings.
5. Assigns the cab to the customer.
6. Updates the cab's location.
7. Updates the cab's availability time.
8. Calculates the trip charges.
9. Updates the cab's total earnings.
   
# 👨‍💻Author
# Praveen M
