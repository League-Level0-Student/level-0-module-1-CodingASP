void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(255,0,0,100);
    ellipse(150, 200, 150, 150);
    fill(255, 0, 0, 100);
    ellipse(212, 200, 150, 150);
    rect(176, 103, 12, 32);
    fill(0,0,0,100);
    if (mousePressed)
   ellipse(80, 200, 30, 80);
    
}
