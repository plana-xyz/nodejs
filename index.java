public class index {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("Welcome to metric converter!");
        System.out.println("Please input your query. For example, 1 km = m.");
        System.out.println("Enter 'exit' or '-1' to exit the program");
        
        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();
            
            if (input.equals("exit") || input.equals("-1")) {
                System.out.println("Thank you for using metric converter!");
                break;
            }
            
            try {
                String[] parts = input.split(" ");
                if (parts.length != 4 || !parts[2].equals("=")) {
                    throw new IllegalArgumentException();
                }
                
                double value = Double.parseDouble(parts[0]);
                String fromUnit = parts[1];
                String toUnit = parts[3];
                
                double result = convert(value, fromUnit, toUnit);
                System.out.printf("%.2f %s = %.2f %s%n", value, fromUnit, result, toUnit);
                
            } catch (Exception e) {
                System.out.println("Your input is not currently handled by this app, please input another query, for example, 1 kg = lb");
            }
        }
        
        scanner.close();
    }
    
    private static double convert(double value, String fromUnit, String toUnit) {
        switch (fromUnit + "to" + toUnit) {
            case "kmtom":
                return value * 1000;
            case "kgtolb":
                return value * 2.20462;
            case "gtoz":
                return value * 0.03527396;
            case "mmtoin":
                return value * 0.0393701;
            case "cmtoin":
                return value * 0.393701;
            case "kmtomi":
                return value * 0.621371;
            default:
                throw new IllegalArgumentException("Conversion not supported");
        }
    }
}
