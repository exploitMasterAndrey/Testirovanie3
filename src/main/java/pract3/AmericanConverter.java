package pract3;

public class AmericanConverter {
    public static Double convertSmToDm(double sm){
        return sm / 2.54;
    }

    public static Double convertDmToFoot(double dm){
        return dm / 12;
    }

    public static Double convertFootToYard(double foot){
        return foot / 3;
    }

    public static Double convertYardToMile(double yard){
        return yard / 1.760;
    }

    public static Double convertDmToHand(double dm){
        return dm / 4;
    }
}
