package pract3;

public class SiConverter {
    public static Double convertTime(String from, double time){
        switch (from){
            case "msec":
                return time / 1000;
            case "sec":
                return time;
            case "min":
                return time * 60;
            case "hr":
                return time * 3600;
        }
        return 0d;
    }

    public static Double convertWeight(String from, double weight){
        switch (from){
            case "gr":
                return weight / 1000;
            case "kg":
                return weight;
            case "tonne":
                return weight * 1000;
            case "ktonne":
                return weight * 1000000;
        }
        return 0d;
    }

    public static Double convertTemperature(String from, double temperature){
        switch (from){
            case "c":
                return temperature;
            case "f":
                return temperature / -17.222;
            case "k":
                return temperature / -272.15;
            case "r":
                return temperature / 1.25;
            case "ra":
                return temperature / -272.594;
        }
        return 0d;
    }
}
