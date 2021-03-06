package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] robArray = new Robot[2];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robArray.length; i++) {
			robArray[i] = new Robot();

			// 4. make each robot start at the bottom of the screen, side by side, facing up
			robArray[i].setX(i * 110);
			robArray[i].setY(500);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random random = new Random();
		boolean b = false;
		while (b == false) {
			for (int n = 0; n < robArray.length; n++) {
				int g = random.nextInt(250);
				robArray[n].move(g);
				for(int l = 0; l < robArray.length; l++) {
					robArray[l].turn(10);
				}

				if (robArray[n].getY() <= 0) {
					b = true;
					System.out.println(robArray[n] + " won!!!!!!!!!!!!! :D");
				}
			}
		}

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
			// done on #5
		// 7. declare that robot the winner and throw it a party!
			// done on #5
		// 8. try different races with different amounts of robots.
		// 9. make the robots race around a circular track.

	}
}
