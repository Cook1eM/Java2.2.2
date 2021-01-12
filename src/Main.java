public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 94;
        float growth = 184;
        float BodyMassindex = service.calculate( growth, weight);
        System.out.println(BodyMassindex);
    }
}
