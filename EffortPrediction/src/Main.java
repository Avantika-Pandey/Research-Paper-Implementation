public class Main {
    public static void main(String[] args) {
        double kloc = 10; // 10,000 lines of code
        double A = 2.94; // Default COCOMO constant
        double B = 1.1;  // Default exponent
        double method = 30; // let's say it's a scaling factor
        double EAF = method / 30.0; // Effort Adjustment Factor

        double effort = A * Math.pow(kloc, B) * EAF;
        System.out.println("Estimated effort = " + effort + " person-months");
    }
}
