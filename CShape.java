abstract class CShape{
    protected String color;
    public void setColor(String str){
        color = str;
    }
    public abstract void show();
}


class CTriangle extends CShape {
    private double a;
    private double b;
    private double c;
    private double area;

   public CTriangle(double a,double b,double c){
     this.a = a;
     this.b = b;
     this.c = c;
   }
  
  public void show(){
    area = a * b * 0.5;
    System.out.println("color:"+color);
    System.out.println("area:"+area);
  }
}

public class triangle{
  public static void main(String[] args) {
    CTriangle t = new CTriangle(3, 4, 5);
    t.setColor("yellow");
    t.show();
  }
}
