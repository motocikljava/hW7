public class Main {
    public static void main(String[] args) {
        // задача 1 and 2
        //часть 1
        int[] massiv = new int[3];
        massiv[0] = 150;
        for (int i = 2; i >= 0; i--) {
            System.out.println(massiv[i]);

        }
        // часть 2
        double[] drobi = new double[]{1.57, 7.654, 9.986};
        for (int w = 2; w >= 0; w--) {
            System.out.println(drobi[w]);
        }

        // часть 3
        boolean[] falseAndTrue = new boolean[]{false, true, 5>7};
        for (int e = 2; e >= 0; e--) {
            System.out.println(falseAndTrue[e]);
        }




    }
}