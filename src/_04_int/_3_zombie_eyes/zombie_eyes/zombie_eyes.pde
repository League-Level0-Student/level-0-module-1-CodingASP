
void setup() {
size (500, 500);
PImage face = loadImage ("download.jpg");
face.resize (400, 400); image (face, 100, 100);
}
void draw() {
ellipse (260, 240, 110, 110);
fill (mouseY, 0, 0);
ellipse (370, 240, 110, 110);
fill (mouseY, 0, mouseY);
ellipse (260, 240, 20, 20);
fill (mouseX, 0, mouseX);
ellipse (370, 240, 20, 20);
fill (mouseX, 0, 0);


}
