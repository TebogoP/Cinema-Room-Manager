# Cinema-Room-Manager
A Java console application for managing a cinema theatre, handling seat bookings, generating sales reports, and maintaining the overall cinema operations.

## Project Description
Cinema Room Manager is a console-based application that helps cinema administrators manage their theatre operations efficiently. The program handles various aspects of cinema management, including:

- Displaying the seating arrangement
- Processing ticket purchases with validation
- Managing seat availability and booking status
- Calculating revenue and detailed statistics
- Providing booking confirmations
- Generating sales reports
- Handling different pricing tiers

## Features

### Core Functionality
- **Interactive Seating Plan**: Visual representation of available ('S') and occupied ('B') seats
- **Ticket Booking System**: Process ticket purchases with real-time validation
- **Dynamic Pricing System**:
  - Rooms with ≤ 60 seats: All tickets $10
  - Rooms with > 60 seats: Front half $10, back half $8
- **Statistics Display**:
  - Number of purchased tickets
  - Occupancy percentage (rounded to 2 decimal places)
  - Current income from purchased tickets
  - Total possible income if all seats are sold
- **Input Validation**:
  - Prevents booking already purchased seats
  - Validates row and seat numbers
  - Handles out-of-bounds inputs
- **Real-time Updates**: Seating plan updates instantly after each booking

### User Interface
Menu-driven interface with options:
```
1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
```
## Technical Requirements
- Java Development Kit (JDK) 11 or higher
- Command line interface
- JUnit 5 for running tests
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

## Usage Examples

### 1. Viewing Seating Arrangement
```
1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 1

Cinema:
  1 2 3 4 5 6
1 S S S S S S
2 S S S S S S
3 S S S S S S
4 S S S S S S
5 S S S S S S
6 S S S S S S
```

### 2. Purchasing a Ticket
```
Enter a row number:
> 3
Enter a seat number in that row:
> 4

Ticket price: $10
```

### 3. Viewing Statistics
```
Number of purchased tickets: 2
Percentage: 5.56%
Current income: $20
Total income: $360
```

### 4. Error Handling Examples
```
Enter a row number:
> 1
Enter a seat number in that row:
> 1

That ticket has already been purchased!

Enter a row number:
> 10
Enter a seat number in that row:
> 20

Wrong input!
```

## Project Structure
```
cinema-room-manager/
├── src/
│   ├── Cinema.java        # Main application class
│   │                      # - Menu handling
│   │                      # - User interface
│   │                      # - Main program loop
│   │
│   ├── CinemaRoom.java   # Cinema operations class
│   │                     # - Seating management
│   │                     # - Ticket pricing
│   │                     # - Booking logic
│   │
│   └── Statistics.java   # Statistics handling
│                        # - Income calculations
│                        # - Occupancy tracking
│                        # - Report generation
│
├── test/
│   ├── CinemaTest.java           # Main test suite
│   ├── CinemaRoomTest.java       # Room operations tests
│   └── StatisticsTest.java       # Statistics tests
│
├── README.md
└── .gitignore
```

## Testing
The project includes comprehensive JUnit tests covering:
- Cinema initialization
- Ticket pricing logic for different room sizes
- Seat purchase validation
- Income calculations
- Statistics accuracy
- Error handling
- Edge cases
- Multiple ticket purchase scenarios

Run tests using:
```bash
javac -cp .:junit-platform-console-standalone.jar test/*.java
java -jar junit-platform-console-standalone.jar --class-path . --scan-class-path
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
