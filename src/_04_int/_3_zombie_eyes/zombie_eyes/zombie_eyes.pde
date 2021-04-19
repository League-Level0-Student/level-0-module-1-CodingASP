
void setup() {
size (500, 500);
PImage face = loadImage ("download.jpg");
face.resize (100, 100); image (face, 100, 100);
}
void draw() {
ellipse (40, 40, 60, 60);
fill (255, 255, 255);

}
