public class BmiService {
    public double calculate(double height, double  weight) {
        double index;
       index = weight / height / height;
        return index;
    }
}