
void setup() {
PImage face = loadImage("face.jpg");
size(500, 500);
face.resize(500, 500);
image(face, 0, 0);

}
void draw() {
ellipse(170, 250, 100, 100);
ellipse(320, 250, 100, 100);
ellipse(170, 250, 20, 100);
ellipse(320, 250, 20, 100);

}
