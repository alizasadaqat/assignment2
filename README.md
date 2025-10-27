# Android Login App — Assignment 2

This Android Studio project demonstrates a simple **login application** built using **Java** and **XML layouts**.  
It includes multiple screens (activities) for login, registration, password recovery, and a landing page.

---

## 📱 Features

### 1. Login Functionality
- Users can log in using **hard-coded credentials** (for example: `admin / 12345`).
- Displays a toast message for success or failure.
- Redirects to the **Home Page** after successful login.

### 2. Registration Page
- Allows users to create a new account (demonstration only, not stored in a database).
- Includes username and password input fields.

### 3. Forgot Password
- Lets users enter their username to reset their password.
- Redirects to the **Reset Password** screen.

### 4. Reset Password
- Allows users to set a new password (demo purpose only).
- Returns to the **Login** screen after confirmation.

### 5. Landing (Home) Page
- Displays a simple welcome message or dashboard after successful login.

---

## 🧭 Navigation
Navigation between screens is handled using **Intents**:
- `LoginActivity → HomeActivity`
- `LoginActivity → RegisterActivity`
- `LoginActivity → ForgotPasswordActivity`
- `ForgotPasswordActivity → ResetPasswordActivity`
- `ResetPasswordActivity → LoginActivity`

---

## 🗂️ Activities Overview

| Activity | Description |
|-----------|--------------|
| `LoginActivity` | Main login screen with username/password fields |
| `RegisterActivity` | New account creation screen |
| `ForgotPasswordActivity` | Page to enter username for password recovery |
| `ResetPasswordActivity` | Page to enter new password |
| `HomeActivity` | Landing screen after successful login |

---

## 🧩 Tech Stack

- **Language:** Java  
- **UI Layouts:** XML  
- **IDE:** Android Studio  
- **Min SDK:** 21+ (Android 5.0 Lollipop)

---

## 📂 Project Structure
app/
├── java/com/example/loginapp/
│ ├── LoginActivity.java
│ ├── RegisterActivity.java
│ ├── ForgotPasswordActivity.java
│ ├── ResetPasswordActivity.java
│ └── HomeActivity.java
└── res/layout/
├── activity_login.xml
├── activity_register.xml
├── activity_forgot_password.xml
├── activity_reset_password.xml
└── activity_home.xml


---

## 🚀 How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/alizasadaqat/assignment2.git


Open the project in Android Studio.

Build and run the app on an emulator or physical Android device.
