# Composite-Shape-Game

This project is part of a university project in which we experimented with GUI programming using Java AWT and Swing frameworks using SOLID design principles. This GUI application consists of a game in which the user can create shapes by selecting a shape type from the combo box, and pressing the panel. The user can also delete shapes by pressing on the tree model and deleting the shape by pressing "delete node" and the list model will update accordingly. The program design consists of a composite design model in which there are nested shapes and shapes. A nested shape is a shape in which shapes can be created and can have a undefined number of shapes within it. A nested shape is the component in this model and a shape is the leaf. The panel in which shapes are created is also a nested shape and is the root of all shapes. Furthermore the program also uses multithreading in order to insure it updates in real time

The full list of functionalities can be found here

- Users can create shapes and nested shapes
- Nested shapes can have shapes within it
- Users can choose if shapes have a floating or bouncing path/movement
- Users can change the colour and fill of shapes
- Users can change the width and height of shapes
- All children within nested shapes inherit their parents colour
