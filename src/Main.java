public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.8;
        //рост в метрах
        double weight = 75;
        //вес в кг
        double myIndex = service.calculate(height, weight);
        System.out.println(myIndex);
    }
}