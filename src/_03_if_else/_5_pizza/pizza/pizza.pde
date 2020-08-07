
void setup() {
    size(800,800);
    noStroke();
    fill(#B8CB27);
    ellipse(400,400,600,600);
    
    
}
void draw() {
  if(mousePressed){
  PImage pepperoni;
    pepperoni = loadImage("pepperoni.png"); 
    PImage mushroom;
    mushroom = loadImage("mushroom.png"); 
    PImage olive;
    mushroom = loadImage("olive.png"); 
  image(pepperoni,400,400);
  pepperoni.resize(30,30);
  image(pepperoni,200,260);
  pepperoni.resize(30,30);
  image(pepperoni,500,190);
  pepperoni.resize(30,30);
  image(pepperoni,540,400);
  pepperoni.resize(30,30);
  image(pepperoni,370,480);
  pepperoni.resize(30,30);
  image(mushroom,350,280);
  mushroom.resize(30,30);
  image(mushroom,250,480);
  mushroom.resize(30,30);
  image(mushroom,150,280);
  mushroom.resize(30,30);
  image(mushroom,410,260);
  mushroom.resize(30,30);
}
}
