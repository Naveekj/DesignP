
public class PrototypePatternDemo {
    public static void main(String[] args){
        ShapeCache.loadCache();

        Shape clonShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shpae : " + clonShape.getType());

        Shape clonShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shpae : " + clonShape2.getType());

        Shape clonShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shpae : " + clonShape3.getType());

    }
}
