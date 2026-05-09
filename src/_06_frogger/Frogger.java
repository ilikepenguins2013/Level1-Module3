package _06_frogger;

import java.awt.Color;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 1000;
    static final int HEIGHT = 750;
    int frogX = 500;
    int frogY = 700;
    int frogWidth = 42;
    int frogHeight = 70;
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
    	car1 = new Car(200, 400, 80, 45);
    	car2 = new Car(290, 400, 80, 45);
    	car3 = new Car(380, 400, 80, 45);
    	car4 = new Car(470, 400, 80, 45);
    }

    @Override
    public void draw() {
    	background(252, 129, 28);
    	fill(Color.GREEN.getRGB());
    	noStroke();
    	ellipse(frogX, frogY, frogWidth, frogHeight);
    	car1.display();
    	car2.display();
    	car3.display();
    	car4.display();
    }
    
    public void keyPressed() {
        if(key == CODED){
            if(keyCode == UP && frogY - frogHeight/2 > 0 )
            {
                frogY-=25;
            	//Frog Y position goes up
            }
            else if(keyCode == DOWN && frogY + frogHeight/2 < HEIGHT)
            {
                frogY+=25;
            	//Frog Y position goes down 
            }
            else if(keyCode == RIGHT && frogX + frogWidth/2 < WIDTH)
            {
                frogX+=25;
            	//Frog X position goes right
            }
            else if(keyCode == LEFT && frogX - frogWidth/2 > 0)
            {
                frogX-=25;
            	//Frog X position goes left
            }
        }
    }
    
    class Car {
    	int carX;
    	int carY;
    	int carSize;
    	int carSpeed;
    	
    	Car(int carX, int carY, int carSize, int carSpeed) {
    		this.carX = carX;
    		this.carY = carY;
    		this.carSize = carSize;
    		this.carSpeed = carSpeed;
    	}
    	
    	void display()
    	  {
    	    fill(0,0,0);
    	    rect(carX , carY,  carSize, 50);
    	  }
    }
    
    
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
