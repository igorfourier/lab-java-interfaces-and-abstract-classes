
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== BigDecimal Operations ===");
        testBigDecimalOperations();
        
        System.out.println("\n=== Car Inventory System ===");
        testCarInventory();
        
        System.out.println("\n=== Video Streaming Service ===");
        testVideoStreaming();
        
        System.out.println("\n=== IntList Interface ===");
        testIntList();
    }

    private static void testBigDecimalOperations() {
        BigDecimal num1 = new BigDecimal("4.2545");
        System.out.println("Original: " + num1);
        System.out.println("Rounded to nearest hundredth: " + 
            BigDecimalOperations.roundToNearestHundredth(num1));
        
        BigDecimal num2 = new BigDecimal("1.2345");
        System.out.println("\nOriginal: " + num2);
        System.out.println("Reversed sign and rounded to nearest tenth: " + 
            BigDecimalOperations.reverseSignAndRoundToNearestTenth(num2));
        
        BigDecimal num3 = new BigDecimal("-45.67");
        System.out.println("\nOriginal: " + num3);
        System.out.println("Reversed sign and rounded to nearest tenth: " + 
            BigDecimalOperations.reverseSignAndRoundToNearestTenth(num3));
    }

    private static void testCarInventory() {
        Sedan sedan = new Sedan("1HGBH41JXMN109186", "Honda", "Accord", 25000);
        UtilityVehicle suv = new UtilityVehicle("5FNRL6H74HB123456", "Honda", "CR-V", 15000, true);
        Truck truck = new Truck("1FTFW1ET5EFC10312", "Ford", "F-150", 30000, 13200.0);
        
        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());
    }

    private static void testVideoStreaming() {
        TvSeries series = new TvSeries("Breaking Bad", 3000, 62);
        Movie movie = new Movie("The Shawshank Redemption", 142, 9.3);
        
        System.out.println(series.getInfo());
        System.out.println(movie.getInfo());
    }

    private static void testIntList() {
        System.out.println("Testing IntArrayList:");
        IntArrayList arrayList = new IntArrayList();
        for (int i = 0; i < 15; i++) {
            arrayList.add(i * 10);
            System.out.println("Added " + (i * 10) + " - Size: " + arrayList.getSize() + 
                ", Capacity: " + arrayList.getCapacity());
        }
        
        System.out.println("\nTesting IntVector:");
        IntVector vector = new IntVector();
        for (int i = 0; i < 25; i++) {
            vector.add(i * 5);
            System.out.println("Added " + (i * 5) + " - Size: " + vector.getSize() + 
                ", Capacity: " + vector.getCapacity());
        }
        
        System.out.println("\nRetrieving values from IntArrayList:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Index " + i + ": " + arrayList.get(i));
        }
    }
}

