class Rectangle
{
    private int length;
    private  int breadth;

    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setLength(int l){
        if(l >0){
            length = l;
        }else{
            length =0;
        }
    }
    public void setBreadth(int b){
        if(b>0){
            breadth =b;
        }else{
            breadth =0;
        }
    }

    public int area(){
        return length *breadth;
    }
    public int perimeter(){
        return  2*(length + breadth);
    }

    public boolean isSqaure(){
        if(length == breadth){
            return true;
        }else{
            return false;
        }

    }

}
public class RectangleClassDemo {
    public static void main(String[] args){
        Rectangle r = new Rectangle();
       r.setBreadth(5);
       r.setLength(5);

        System.out.println("area: "+ r.area());
        System.out.println("Issqaure: "+r.isSqaure());
    }
    
}
