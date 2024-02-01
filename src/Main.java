public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(1.78, 98.45);
        System.out.println(bmi);
    }
}
