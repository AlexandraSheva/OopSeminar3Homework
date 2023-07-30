package Task1;

public class Rectangle implements Style, Show, Parameters, Drawing, Calculating {
  
  private double height;

  private double width;

  public Rectangle (double height, double width) {
    this.height = height;
    this.width = width;
  }

  @Override
  public void draw() {
    System.out.println("Drawing rectangle...");
    
  }

 
  public void setHeight (double height) {
    this.height = height;
  }

  
  public void setWidth(double width) {
    this.width = width;  
  }

  @Override 
  public double getHeight() {
    return height;
  }

  @Override
  public double getWidth() {
    return width;
  }

  public double area() {
    return getHeight() * getWidth();
  }

  
  public double perimeter() {
    return (getHeight() + getWidth())*2;
  }

  public boolean isSquare () {
    return getHeight() == getWidth();
  }
  

  public void showAll() {
    
    System.out.printf ("Мы построили прямоугольник высотой %s, шириной %s, площадью %s, с периметром %s. ", getHeight(),getWidth(),area(),perimeter());
    System.out.printf ("Цвет прямоугольника: %s. Обводка прямоугольника: %s.", COLOR, BORDERCOLOR);

  }

}