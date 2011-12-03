package Taxi;

import static java.lang.System.exit;

/**
 * Created by IntelliJ IDEA.
 * User: CLK
 * Date: 11-12-3
 * Time: 下午4:34
 * To change this template use File | Settings | File Templates.
 */
public class Run {
    public static void main(String args[])
    {
        try{
            if(args.length!=1)
            {
                Usage();
                exit(0);
            }
            double price=new PriceCalculator().Calculate(Double.parseDouble(args[0]));
            System.out.println("The price of this trip is: "+price+" RMB");
        }
        catch (NumberFormatException e){
            Usage();
        }
    }

    private static void Usage(){
        System.out.println("Usage:\n\tjava -jar PriceCalculator.jar [distance]");
        System.out.println("\tdistance refers to a number.");
    }
}
