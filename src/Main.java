public class Main {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100");
        for (int i = 1; i <= 100; i++) {
            if (checkSNT(i)) {
                System.out.print(i+", ");
            }
        }

    }

    static boolean checkSNT(int number) {
        if (number < 2) return false;
        else {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) return false;
            }
        }
        return true;
    }
}
