class Circle{

    int radius;
    final int a = 100;

    void setRadius(int r){
        radius =r;

    }

    double calArea(){
        return 3.14 * radius * radius;
    }

    void print(){
        System.out.println("원의 반지름: "+ radius);
        System.out.println("원의 면적: "+ calArea());
    }

    Circle getback(int r){
        Circle obj2 = new Circle();
        obj2.setRadius(a + r);

        return obj2;
    }
}

public class Main{

    public static void main(String[] args){
        Circle obj = new Circle();
        obj.getback(100).print();
    }
}