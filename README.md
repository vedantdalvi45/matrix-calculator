# 🎯 Matrix Calculator - Determinant Solver


A **Java Swing application** developed during my 2nd-year diploma studies that calculates determinants for **2x2 and 3x3 matrices**, displaying both the **final result** and a **step-by-step breakdown** of the calculation. This educational tool is designed to help students understand how matrix determinants are computed.

---

## 🧮 Features

### 📌 Matrix Operations
- ✅ **2x2 Determinant Calculation**
  - Formula:  
    \[
    \text{det}(A) = (a × d) - (b × c)
    \]
- ✅ **3x3 Determinant Calculation**
  - Formula:  
    \[
    \text{det}(A) = a(ei − fh) − b(di − fg) + c(dh − eg)
    \]
- 📐 Visual matrix display with proper bracket notation
- ⚡ Real-time calculation with instant updates

### 📚 Educational Tools
- 📘 **Step-by-step solutions** showing:
  - Intermediate matrix minors
  - Signs and co-factors
  - Breakdown of final calculation
- 🎨 **Color-coded** elements to visualize operations
- 🧠 Enhanced mathematical understanding through detailed workflows
- 🔐 Input validation to prevent incorrect entries

### 🖥️ User Interface
- 🧩 Intuitive input grid for 2x2 or 3x3 matrices
- 🧮 Dedicated **"Calculate"** button
- ♻️ **"Clear"** button to reset inputs
- 📱 Responsive and adaptive layout
- ✅ Visual cues and feedback during input and calculations

---

## 🚀 How to Use

1. ### **Select Matrix Size**
   - Choose between **2x2** and **3x3** matrices using the matrix size toggle or radio buttons.

2. ### **Enter Matrix Elements**
   - Input numerical values in the matrix grid.

3. ### **Calculate Determinant**
   - Click the **"Calculate"** button to:
     - View a **step-by-step breakdown** of the calculation
     - See intermediate results
     - Get the **final determinant value**

4. ### **Clear or Reset**
   - Click **"Clear"** to reset all inputs and start over.

---

## 🛠️ Technologies Used

- **Java 8+**
- **Swing (javax.swing)** for GUI
- **Java AWT** for layout and events
- **Basic math logic** for determinant calculations

---

## 📦 Installation & Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/matrix-calculator.git
   cd matrix-calculator
