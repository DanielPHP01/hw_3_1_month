public class Main {
    public static void main(String[] args) {
        double[] numbers = {5.86, 8.35, -22.66, -12.65, -18.77, 54.8, -84.0, 35.0, -17.43, 37.54, 15.35, -17.34, 18.45, 19.43, 14.33, 15.21};
        double summa = 0;
        int result = 0;
        boolean check = false;


        for (double i : numbers) {
            if (i < 0) {
                check = true;
            } else if (i > 0 && check) {
                summa += i;
                result++;


            }

        }
        System.out.println(summa / result);


        //ДЗ на собраз.

        int[] sort = {4, -2, 2, -3, 6, -8};


        for (int i = 0; i < sort.length; i++) {
            int min = sort[i];
            int minId = i;
            for (int j = i + 1; j < sort.length; j++) {
                if (sort[j] < min) {
                    min = sort[j];
                    minId = j;
                }
            }

            int temp = sort[i];
            sort[i] = min;
            sort[minId] = temp;

            System.out.println(sort[i]);
        }

    }
}












