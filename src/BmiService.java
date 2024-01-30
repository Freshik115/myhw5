public class BmiService {
    public double calculate() {
        double height = 1.78; //измерение в метрах
        double weight = 98.45; //измерение в килограммах
        double bmi;
        bmi = weight / (height * height);


        return (int) bmi;
    }
}
