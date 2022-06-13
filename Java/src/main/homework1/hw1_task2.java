public class hw1_task2 {
//    Попробовать сгенерировать все перестановки длины N из K чисел с повторениями.
//        Пример: N = 2, K = 3 ответ "00 01 02 10 11 12 20 21 22"
public static void main(String[] args) {
    int n = 2;
    int k = 5;
    int len = (int)Math.pow(n,k) + 1;
    String[] arr = new String[len];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < k; j++) {
            arr[i] = String.valueOf(i);
            arr[i] += String.valueOf(j);
            System.out.println(arr[i]);
        }
    }
}



}
