# Anagram Checker in Java

 This is a simple Java program that checks if two input strings are anagrams of each other. The program takes user input from the keyboard and determines whether the given words contain the same characters in a different order.

## Features

 1. Accepts user input from the console.

 2. Converts input to lowercase for case-insensitive comparison.

 3. Uses an optimized frequency count approach (O(n) time complexity).

 4. Provides real-time output indicating whether the strings are anagrams.

## Prerequisites

  Java 17 or later installed

## How to Run

1. **Clone this repository:**
    ```bash
    git clone https://github.com/DhirendraSingh12/Anagram_Check.git
    cd Anagram-Check
    
2. **Compile the Java program:**
   ```bash
     javac AnagramCheck.java

3. **Run the program:**
   ```bash
     java AnagramCheck

## Output Preview

   ![Image](https://github.com/user-attachments/assets/c020caf3-c37f-4baa-93e4-f7c7afbb7efa)
   ![Image](https://github.com/user-attachments/assets/bbaa1292-443f-44e6-8765-1dc39265993d)

## Code Explanation

   The program uses:

     Scanner to take input from the user.

     toLowerCase() to ensure case insensitivity.

     Frequency count array (int[] frequency = new int[26]) to count character occurrences.

     A single pass traversal (O(n)) to check for anagrams efficiently.
