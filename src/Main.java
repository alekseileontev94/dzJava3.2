public class Main {
    public static void main(String[] args) {
        System.out.println("рассчиет индекс массы тела");
        BmiService service = new BmiService();
        int weightInKg = 98;
        double helgntInMeters = 1.87;
        int bmi;
        bmi = service.calcculate(weightInKg, helgntInMeters);
        System.out.println(bmi);

    }
}