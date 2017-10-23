README

We implement TicTacToe using the Model-View-Controller design pattern.
For installation and running instructions, please see 
Section 1. For design decisions, please see Section 2.For information on extending components, please see Section 3.

#Section 1
Installing and Running
To compile and run this code follow the instructions of the README.me file on the test folder ../test/README.md

#Section 2
Used MVC as design pattern to separate content from presentation (Swing GUI framework) and the data-processing(model) from content.
All the JFRame, JButton, JTextArea objects is inside a class named View. And it's initialized in the constructor. The view renders the contents of the model class and specifies exactly how the model data should be presented

All the code that pertains to data-processing and its modification is in the Model class. Has all the data and rules govern access to and updates of this data

All the button listeners and actions performed are in the controller class.  The controller translates the user's interactions with the view 
into actions that the model will perform.

#Section 3
To make the change the board size, modify the constant variable BOARD_SIZE in the View class. 