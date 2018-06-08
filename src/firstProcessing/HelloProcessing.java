package firstProcessing;

import processing.core.*;

public class HelloProcessing extends PApplet {

	public void settings() {
		size(400, 300);
	}

	public void setup() {
		background(50);
		smooth();
		strokeWeight(5);
	}

	public void draw() {
		if (mousePressed) {
			Circle circle = new Circle(this, mouseX, mouseY, random(0, 50));
			circle.draw();
		}
	}

	public static void main(String args[]) {
		PApplet.main("firstProcessing.HelloProcessing");
	}
	
}