package Task0;

public class Main {
  public static void main(String[] args) {
    double c = 5.0;
    double d = 4.0;
    RectangleArea area = (x, y) -> x * y;
    System.out.println("Площадь прямоугольника длиной 5 и шириной 4 равна "+ area.getArea(c, d) + " .");
  }
}
