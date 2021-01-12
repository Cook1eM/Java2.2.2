public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 94;
        float growth = 1.84F;
        float bodymassindex = service.calculate(growth, weight);
        System.out.println(bodymassindex);
    }
}
