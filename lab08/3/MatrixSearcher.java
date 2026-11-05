public class MatrixSearcher {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 0, 1, 2},
            {3, 4, 5, 6}
        };
        findFirstZero(m);
    }
    private static void findFirstZero(int[][] m) {
        int r = -1;
        int c = -1;
        boolean f = false;
        search:
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 0) {
                    r = i;
                    c = j;
                    f = true;
                    break search;
                }
            }
        }
        if (f) {
            System.out.println("[" + r + "][" + c + "]");
        } else {
            System.out.println("Не найдено");
        }
    }
}
