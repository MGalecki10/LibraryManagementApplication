# Library Management Application

This is a simple library management application written in Java. It allows users to add books and magazines to the library, print the available books and magazines, and exit the program.

## Getting Started
To run the library management application, follow these steps:
1. Clone the repository or download the source code files.
2. Open the project in your preferred Java development environment.
3. Compile the Java files.
4. Run the **'LibraryApp'** class.

##Usage
Upon running the application, you will see a list of options:
![Image](https://tiny.pl/c7xqq)

"""
Wybierz opcję:
0 - Wyjście z programu 
1 - Dodanie książki 
2 - Dodanie magazynu/gazety 
3 - Wyświetlenie dostępnych książek 
4 - Wyświetlenie dostępnych magazynów/gazet 
""""

Enter the number corresponding to the desired option and press Enter.
•	Option 0: Exit the program.
•	Option 1: Add a book to the library.
•	Option 2: Add a magazine to the library.
•	Option 3: Print the available books in the library.
•	Option 4: Print the available magazines in the library.

Follow the on-screen instructions to provide the necessary details for adding books and magazines.

##Code Structure
The application consists of the following classes:
•	**'LibraryApp'**: The main class that initializes the application and starts the control loop.
•	**'LibraryControl'**: Handles the control flow of the application, including presenting options, reading user input, and performing corresponding actions.
•	**'Option'**: An enum representing the available options in the library application.
•	**'NoSuchOptionException'**: A custom exception class thrown when an invalid option is selected.
•	**'DataReader'**: Responsible for reading user input from the console.
•	**'Book'**: Represents a book publication with attributes such as author, pages, and ISBN.
•	**'Library'**: Represents the library and provides methods for adding books and magazines, as well as printing them.
•	**'Magazine'**: Represents a magazine publication with attributes such as publication month, day, and language.
•	**'Publication'**: Represents a generic publication with attributes like title, publisher, and publication year.

##Future Improvements
While this application provides basic functionality, there are several areas for improvement:
•	Input validation: Implement proper validation for user input to handle invalid data gracefully.
•	Error handling: Add appropriate exception handling and error messages to improve the user experience.
•	Data persistence: Consider integrating a database or file system to store library data between application runs.
•	User interface: Enhance the application with a graphical user interface (GUI) for a more user-friendly experience.

##Acknowledgments
The library management application was developed as an exercise to practice Java programming concepts.

