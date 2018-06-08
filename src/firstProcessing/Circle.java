package firstProcessing;

import processing.core.*;

public class Circle {
	PApplet pApplet;
	float x, y, r;
	int c;

	Circle(PApplet p, float x, float y, float r) {
		pApplet = p;
		this.x = x;
		this.y = y;
		this.r = r;
		this.c = pApplet.color(pApplet.random(255));
	}
}