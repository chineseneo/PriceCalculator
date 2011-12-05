package Taxi;

/**
 * Created by IntelliJ IDEA.
 * User: CLK
 * Date: 11-12-3
 * Time: 下午4:17
 * To change this template use File | Settings | File Templates.
 */
public class PriceCalculator {
    private final double basePrice =6;
    private final double fuelPrice =1;
    private final double unitPrice =2;
    private final double baseDistance =2;
    private final double zeroPrice=0;

    public double Calculate(double distance) {
        return BasePrice(distance) + FuelPrice(distance) + ExtraPrice(distance);
    }

    private double BasePrice(double distance){
        return distance == 0 ? zeroPrice : basePrice;
    }

    private double FuelPrice(double distance){
        return distance == 0 ? zeroPrice : fuelPrice;
    }

    private double ExtraPrice(double distance){
        return distance <= 2 ? zeroPrice : (Math.round(distance) - baseDistance) * unitPrice;
    }
}
