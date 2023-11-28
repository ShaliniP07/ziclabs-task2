# ziclabs-task2
## Word Counter in Java programming Language
## Author: Shalini P
## Batch: (1 November- 30 November,2023)
## Domain: 
JAVA Programming
## Aim: 
To build a Word Counter
## Description/Working of code:
1. User Input: The program prompts the user to input whether they want to count the words in a file or a text. Based on the user's input, the program reads the file content or text and processes it.

2. Reading File Content or Text: If the user selects "file", the program reads the file content using a File object and a Scanner object. If the user selects "text", the program directly reads the text entered by the user.

3. Counting Words: The program defines a separate method called count_Words to count the number of words in the text. It uses a regular expression ([^a-zA-Z0-9']+) to split the text into individual words and then counts the number of words in the resulting array.

4. Displaying Result: After processing the file content or text, the program displays the total count of words. If the program encounters any errors while reading the file or text, it will notify the user and exit.

5. Program Conclusion: The Word Counter program provides an easy and efficient way for users to count the number of words in a file or a text. The program's simplicity and effectiveness make it a valuable tool for anyone needing to quickly count the words in a given document.
