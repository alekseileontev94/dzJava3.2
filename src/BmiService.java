public class BmiService {


    public int calcculate(int weightInKg, double heightInMeters) {
        double bmi = weightInKg / heightInMeters / heightInMeters;
        return (int) bmi;
    }

}
