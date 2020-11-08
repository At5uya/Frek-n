public class Main {

    public static void main(String[] args) {
        System.out.println(Frekšns.createNormalised(120, 12));
        System.out.println(Frekšns.createNormalised(4, 12));
        System.out.println(new Frekšns(2, 4).plus(new Frekšns(3, 9)));
        System.out.println(new Frekšns(2, 4).minus(new Frekšns(3, 9)));
        System.out.println(new Frekšns(2, 4).times(new Frekšns(3, 9)));
        System.out.println(new Frekšns(2, 4).dividedBy(new Frekšns(3, 9)));
    }
}