import processing.core.PApplet;

public class Sketch extends PApplet {

  private boolean isHovering = false;

  public void settings() {
    size(800, 800);
  }

  public void setup() {
    background(100);
  }

  public void draw() {
    for (int i = -100; i < 1000; i += 110) {
      drawSmallHeart(i, 25, 20);
      drawSmallHeart(i, 150, 20);
      drawSmallHeart(i, 250, 20);
      drawSmallHeart(i, 380, 20);
      drawSmallHeart(i, 550, 20);
      drawSmallHeart(i, 650, 20);
    }

    for (int i = -100; i < 1000; i += 200) {
      drawFace(i, 25, 94, 60, 0);
      drawFace(i - 20, 200, 94, 95, 182);
      drawFace(i - 70, 375, 160, 95, 182);
      drawFace(i - 90, 550, 188, 8, 25);
    }

    drawSquare();
  }

  public void drawSmallHeart(int heartX, int heartY, int size) {
    fill(255, 0, 0);
    beginShape();
    vertex(heartX, heartY);
    bezierVertex(heartX - size, heartY - size, heartX - size * 2, heartY + size / 2, heartX, heartY + size * 2);
    bezierVertex(heartX + size * 2, heartY + size / 2, heartX + size, heartY - size, heartX, heartY);
    endShape();
  }

  public void drawFace(int x, int y, int faceRed, int faceGreen, int faceBlue) {
    ellipse(100 + x, 100 + y, 150, 150);
    fill(255);
    ellipse(75 + x, 85 + y, 30, 20);
    ellipse(125 + x, 85 + y, 30, 20);
    fill(0);
    ellipse(75 + x, 85 + y, 10, 10);
    ellipse(125 + x, 85 + y, 10, 10);
    fill(faceRed, faceGreen, faceBlue);
    arc(100 + x, 125 + y, 80 + x, 50 + y, 0 + x, (float) 3.14);
    line(60 + x, 125 + y, 140 + x, 125 + y);
    ellipse(x + 275, y + 25, 50, 50);
    ellipse(x + 335, y + 25, 50, 50);
  }

  public void drawSquare() {
    if (isSquareHovered()) {
      fill(0, 255, 0);
    } else {
      fill(150);
    }

    rect(0, height - 50, width, 50);
    fill(255);
  }

  public boolean isSquareHovered() {
    return mouseX > 0 && mouseX < width && mouseY > height - 50 && mouseY < height;
  }

}