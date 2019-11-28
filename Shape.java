interface Shape{
  abstract double getArea();
}

class Rectangle implements Shape{
  private double length;
  private double width;
  
  public Rectangle(double length , double width ){
    this.length = length;
    this.weight = weight;
  }
  
  public double getArea(){
    double ans = length*weight;
    return ans;
  }
  
  public string toSting(){
    String ans= double.toString(getArea());
    return ans;
  }
  
}

class Triangle implements Shape{
  private double base;
  private double height;
  
  public Triangle (double base ,double height){
    this.base = base;
    this.height = height;
  }
  
  public double getArea(){
    double ans = base*height*0.5;
    return ans;
  }
  
  public string toString{
    return double.toStirng(getArea());
  }
}

