package lesson_09.classwork2503;

import java.util.Scanner;
// pow - возведение в степень
//sqrt - квадратный корень
// sin cos tan - тригонометрические функции
// max/min - возвращается большее/меньшее двух чисел
//abs - значение по модулю
//round - математическое округление по модулю
public class main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(Math.pow(2, i));
        }
    }
}
