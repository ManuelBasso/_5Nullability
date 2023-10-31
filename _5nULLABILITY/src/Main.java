public class Main {
    public static void main(String[] args) {
        Integer numeratore = 5;
        Integer denominatore = null;

        try {
            divisione(numeratore, denominatore);
        } catch (ArithmeticException e) {
            System.out.println("Eccezione Aritmetica " + e);
        } catch (Exception e) {
            System.out.println("Altra eccezione" + e);
        }
    }

    static void divisione(int num, int den) {
        System.out.println(num / den);
    }
}