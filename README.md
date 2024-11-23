# Cinema-Room-Manager
A Java console application for managing a cinema theatre, handling seat bookings, generating sales reports, and maintaining the overall cinema operations.

## Project Description
Cinema Room Manager is a console-based application that helps cinema administrators manage their theatre operations efficiently. The program handles various aspects of cinema management, including:

- Displaying the seating arrangement
- Processing ticket purchases
- Managing seat availability
- Calculating revenue and statistics
- Providing booking confirmations
- Generating sales reports

## Features
- **Interactive Seating Plan**: Visual representation of available and occupied seats
- **Ticket Booking System**: Process ticket purchases with price calculations
- **Dynamic Pricing**: Different pricing for front and back rows
- **Statistics Display**: Shows number of purchased tickets, occupancy percentage, current income, and total possible income
- **Input Validation**: Ensures valid seat selections and handles errors appropriately
- **Real-time Updates**: Seating plan updates automatically after each booking

## Technical Requirements
- Java Development Kit (JDK) 11 or higher
- Command line interface
- Basic understanding of Java programming concepts

## Installation
1. Clone this repository:
```bash
git clone https://github.com/TebogoP/cinema-room-manager.git
```

2. Navigate to the project directory:
```bash
cd cinema-room-manager
```

3. Compile the Java files:
```bash
javac src/*.java
```

4. Run the program:
```bash
java src/Cinema
```

## Usage
The program presents a menu with the following options:

1. **Show the seats**: Displays current seating arrangement
2. **Buy a ticket**: Process ticket purchase
3. **Statistics**: View sales and occupancy information
4. **Exit**: Close the program

### Example Operation
```
1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 1

Cinema:
  1 2 3 4 5 6 7 8
1 S S S S S S S S
2 S S S S S S S S
3 S S S S S S S S
4 S S S S S S S S
5 S S S S S S S S
6 S S S S S S S S
7 S S S S S S S S

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 2

Enter a row number:
> 3
Enter a seat number in that row:
> 4

Ticket price: $10
```

## Project Structure
```
cinema-room-manager/
├── src/
│   ├── Cinema.java        # Main application file
│   ├── Seat.java         # Seat management class
│   └── Statistics.java   # Statistics handling class
├── test/                 # Test files
├── README.md
└── .gitignore
```
## Error Handling
The program handles various error scenarios:

- Invalid seat selection
- Out of bounds row/seat numbers
- Already purchased seats
- Invalid menu options

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments
- Project inspired by JetBrains Academy
- Based on real-world cinema management systems
- Developed as part of the Java Developer track

## Contact
Tebogo - @TebogoP - tphiri.firi@gmail.com

Project Link: https://github.com/TebogoP/Cinema-Room-Manager
