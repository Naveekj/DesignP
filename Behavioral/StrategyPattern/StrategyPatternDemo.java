
public class StrategyPatternDemo {
    public static void main(String[] args){
        Context context = new Context(new OperationAdd());
        System.out.println("2 + 3 = " + context.excuteStrategy(2, 3));
        
        context = new Context(new OperationSubstract());
        System.out.println("7 - 3 = " + context.excuteStrategy(7, 3));
        
        context = new Context(new OperationMultiply());
        System.out.println("2 * 3 = " + context.excuteStrategy(2, 3));

        
    }
}
