PImage pepperoni ;
void setup() {
    size(200, 200);
    fill(#C4A484);
    ellipse(100,100,115,115);
    fill (#DC143C);
    ellipse(100,100,100,100);
    fill (#FFFF00);
    ellipse(100,100,90,90);
    pepperoni = loadImage("pepperoni.png");
    pepperoni.resize (30,30);
}
void draw() {
    image (pepperoni, 100,100);
    image (pepperoni, 80,120);
    image (pepperoni, 70,50);
    image (pepperoni, 60,90);
    image (pepperoni, 100,60);
  
}
