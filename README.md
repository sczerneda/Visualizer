# Visualizer
## Why does this program exist?
Because I am a tremendously visual person. 
Traditional visualizations (such as UML class diagrams) are helpful, but I wanted something that allowed me to drill down and follow the flow of the data itself. What things can I get out of this class? What things can I put in? Do I need something from this class that it can't currently provide? Does it need a function added to return that value?
All these things might be more obvious to a more experienced programmer/designer, but until I get there, I figured I'd make myself a little helper. 

## What can I do with this program?
Right now, not much. But the planned interactions are:
- Create a project, which can contain a mix of language-agnostic classes and/or functions and/or methods.
- Place a class in the project's workspace, and customize the inputs (i.e. the values you update in a class, its mutators) and outputs (i.e. the values you can get out of a class, its accessors). The different inputs/outputs are visualized as lines coming into/out of the rectangle representing the class and labelled with the names provided
- Place methods or functions; similar to the class, these can be customized with inputs and an output. 
- Zoom into a class to view its methods, Inside a class view:
-- you can drag the outputs of a method to the right side to create a matching class output at the class view level (i.e. the method's access level becomes public)
-- you can drag the methods inputs (ie parameters) to the left side to make them class inputs (also makes the method public)