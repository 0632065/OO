abstrast class CShape
{
	public static void main(String[] args) {
		
    }

	public void show() {
		color=str;
	}

	public abstract void show();
  
}



class Ccircle extends CShape
{
  protected double radius;
  public CCircle(double r){
  radius=r;
  }

  public void show(){
  System.out.print("color="+color+", ");
  System.out.println("area="+3.14*radius*radius);
  }


class CRectangle extends CShape{
  }


}
