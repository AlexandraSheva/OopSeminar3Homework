package Task0;

public class Main {
  public static void main(String[] args) {
    
    RectangleArea area = (x, y) -> x * y;
    System.out.println("Площадь прямоугольника длиной 5 и шириной 4 равна "+ area.getArea(5.0, 4.0) + " .");
  }
}
