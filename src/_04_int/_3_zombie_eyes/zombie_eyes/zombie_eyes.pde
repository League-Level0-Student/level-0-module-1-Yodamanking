
void setup() {
  PImage face = loadImage("face.jpeg");
  size(700,700);
  face.resize(700,700);
  image(face, 0, 0);
  background(face);
}
void draw() {
  fill(255,0,0);
  if(mouseX < 400 && mouseY<400){
    fill(0, 255, 0);
  }
  ellipse(480,400,200,150);
  ellipse(220, 400, 200, 150);
  fill(0,0,0);
  ellipse (220, 400, 20, 20);
  ellipse(480, 400, 20, 20);
}
