package Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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

    List<Rectangle> list = new ArrayList<>();
    list.add (r1);
    list.add(new Rectangle(5.0, 1.0));
    list.add(new Rectangle(2.0, 3.0));
    list.add(new Rectangle(3.5, 8.0));
    list.add(new Rectangle(4.6, 4.6));
    list.add(new Rectangle(9.0, 12.0));

    Comparator<Rectangle> parComparator = (rect1, rect2) -> rect1.area() - rect2.area();

    list.sort(parComparator);

    for (Rectangle rect : list) {
      System.out.println(rect);
    }

  }
}