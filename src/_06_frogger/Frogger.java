package _06_frogger;

import java.awt.Color;

import processing.core.PApplet;
import processing.core.PImage;

public class Frogger extends PApplet {
	static final int WIDTH = 1000;
	static final int HEIGHT = 750;
	int frogX = 500;
	int frogY = 700;
	int frogWidth = 42;
	int frogHeight = 70;
	PImage back;
	PImage carLeft;
	PImage carRight;
	PImage frog;
	Car car1;
	Car car2;
	Car car3;
	Car car4;

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		back = loadImage("src/_06_frogger/froggerBackground.png");
		back.resize(WIDTH, HEIGHT);
		car1 = new Car(-80, 590, 80, 20, false);
		//car2 = new Car(WIDTH, 500, 80, 27, true);
		car2 = new Car(-80, 380, 80, 33, true);
		car3 = new Car(WIDTH, 200, 80, 43, false);
		
		
		
		
		carLeft = loadImage("src/_06_frogger/carLeft.png");
	    carLeft.resize(80,50);
	    carRight = loadImage("src/_06_frogger/carRight.png");
	    carRight.resize(80,50);
	}

	@Override
	public void draw() {
		background(back);
		fill(Color.GREEN.getRGB());
		noStroke();
		ellipse(frogX, frogY, frogWidth, frogHeight);
		if (intersects(car1) || intersects(car2) || intersects(car3)  /*intersects(car4)*/) {
			frogX = 500;
			frogY = 700;
		}
		car1.display();
		car2.display();
		car3.display();
		//car4.display();
		car1.moveCarLeft();
		car2.moveCarRight();
		car3.moveCarLeft();
		//car4.moveCarRight();
		
		
	}

	public void keyPressed() {
		if (key == CODED) {
			if (keyCode == UP && frogY - frogHeight / 2 > 0) {
				frogY -= 50;
				// Frog Y position goes up
			} else if (keyCode == DOWN && frogY + frogHeight / 2 < HEIGHT) {
				frogY += 50;
				// Frog Y position goes down
			} else if (keyCode == RIGHT && frogX + frogWidth / 2 < WIDTH) {
				frogX += 25;
				// Frog X position goes right
			} else if (keyCode == LEFT && frogX - frogWidth / 2 > 0) {
				frogX -= 25;
				// Frog X position goes left
			}
		}
		
		
	}

	boolean intersects(Car car) {
		if ((frogY >= car.getY() && frogY <= car.getY() + 50)
				&& (frogX >=car.getX() && frogX <= car.getX() + car.getSize())) {
			return true;
		} else {
			return false;
		}
	}
	
	class Car {
		int carX;
		int carY;
		int carSize;
		int carSpeed;
		boolean facingRight;

		Car(int carX, int carY, int carSize, int carSpeed, boolean facingRight) {
			this.carX = carX;
			this.carY = carY;
			this.carSize = carSize;
			this.carSpeed = carSpeed;
			this.facingRight = facingRight;
		}

		int getX() {
			return carX;
		}

		int getY() {
			return carY;
		}

		int getSize() {
			return carSize;
		}

		void display() {
			fill(0, 0, 0);
			if(facingRight) {
				image (carRight, carX, carY);
			}
			else {
				image (carLeft,carX, carY);
			}
		}

		public void moveCarLeft() {
			carX -= carSpeed;
			if (carX <= -carSize) {
				carX = WIDTH;
			}
		}

		public void moveCarRight() {
			carX += carSpeed;
			if (carX >= WIDTH) {
				carX = -carSize;
			}
		}

		
	}
		static public void main(String[] args) {
			PApplet.main(Frogger.class.getName());
		}

}
