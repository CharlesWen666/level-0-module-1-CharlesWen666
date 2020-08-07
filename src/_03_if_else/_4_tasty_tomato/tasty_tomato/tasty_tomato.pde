void setup() {
    size(500, 500);
}
void draw() {
  background(#FFFFFF);
    noStroke();
    fill(#EA2F2F);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#F0A611);
    rect(176, 103, 12, 32);
    if(mousePressed){
    fill(#FFFFFF);
    ellipse(80,190,50,50);
    }
    
}
