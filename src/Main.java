public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] sum = {22, 23, 55, 6, 85};
        int salarySum = 0;
        for (int i : sum) {
            salarySum += i;
        }
        System.out.println("Сумма трат за месяц составила " + salarySum + " руб");

        System.out.println("Задача 2");
        int[] sum1 = {22, 23, 55, 6, 85};
        int max = -1;
        for (int i = 0; i < sum1.length; i++) {
            if (sum1[i] > max) {
                max = sum1[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила "+ max +" руб");
        int min= sum1[0];
        for (int i = 0; i <sum1.length; i++) {
            if (sum1[i]< min) {
                min = sum1[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила "+min+" руб");


        System.out.println("Задача 3");
        int[] arr = {22, 23, 55, 6, 85};
        int summ = 0;
        int averageValue = 0;
        for (double element: arr){
            summ+=element;
            averageValue=summ/5;
        }
        System.out.println("Средняя сумма трат за месяц составила "+averageValue+ " руб");

        System.out.println("Задача 4");
        char[] reverseFullName={'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i=0; i< reverseFullName.length/2; i++){
            char temp = reverseFullName[i];
        reverseFullName[i] = reverseFullName[reverseFullName.length-i-1];
        reverseFullName[reverseFullName.length-i-1] = temp;
        }
        for (char num: reverseFullName){
            System.out.print(num + " ");
        }


    }
}