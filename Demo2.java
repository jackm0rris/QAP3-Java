public class Demo2 {
    public static void main(String[] args) {
        Point point = new Point(1.0f, 2.0f);
        System.out.println("Point: " + point);
        
        point.setXY(3.0f, 4.0f);
        System.out.println("Updated Point: " + point);

        MovablePoint movablePoint = new MovablePoint(5.0f, 6.0f, 1.0f, 1.5f);
        System.out.println("MovablePoint: " + movablePoint);
        
        movablePoint.move();
        System.out.println("After move: " + movablePoint);
        
        movablePoint.move();
        System.out.println("After another move: " + movablePoint);
    }
}

