public class Main {
    public static void main(String[] args) {
        // задача 4
        //
        int[] massiv = new int[]{2, 3, 5};
        for (int i = 0; i < 3; i++) {
            if (massiv[i] % 2 != 0) {
                massiv[i]++;
            }
            System.out.println(massiv[i]);
        }

    }
}