package unit2_recursion.Mazes;

import java.io.IOException;

public class mazeBase {
	
	public static void main(String args[]) throws Exception {
        mazeMaker maker = new mazeMaker();
        maker.starter();

        System.out.print("Press Enter to show solution: ");
        System.in.read();

        Maze Maze = new Maze("maze.txt");
        Maze.traversal();
	}
}
