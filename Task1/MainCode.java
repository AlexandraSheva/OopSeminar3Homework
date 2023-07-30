package Task1;

public class MainCode {
  public static void main(String[] args) {
    
    Rectangle r1 = new Rectangle(3,2);
    System.out.printf ("Мы построили прямоугольник высотой %s и шириной %s. ", r1.getHeight(), r1.getWidth());
    r1.setHeight(4);
    r1.setWidth(4);
    if (r1.isSquare() == true) {
      CircleIn c1 = (x) -> Math.PI * Math.pow((x/2),2);
      System.out.println("Площадь круга, вписанного в этот квадрат равна " + c1.circle(r1.getHeight()) + " .");
    }

    
    



  }
}