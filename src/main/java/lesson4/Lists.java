package lesson4;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;
import static lesson1.Simple.discriminant;

public class Lists {

    /**
     * Пример
     * <p>
     * Найти все корни уравнения x^2 = y
     */
    public static List<Double> sqRoots(Double y) {
        if (y < 0) {
            return List.of();
        }

        if (y == 0) {
            return List.of(0.0);
        } else {
            Double root = sqrt(y);
            return List.of(-root, root);
        }
    }

    /**
     * Пример
     * <p>
     * Найти все корни биквадратного уравнения ax^4 + bx^2 + c = 0.
     * Вернуть список корней (пустой, если корней нет)
     */
    public static List biRoots(double a, double b, double c) {

        if (a == 0.0) {
            return b == 0.0 ? List.of() : sqRoots(-c / b);
        }
        double d = discriminant(a, b, c);
        if (d < 0.0) {
            return List.of();
        }
        if (d == 0.0) {
            return sqRoots(-b / (2.0 * a));
        }

        double y1 = (-b + Math.sqrt(d)) / (2.0 * a);
        double y2 = (-b - Math.sqrt(d)) / (2.0 * a);
        List<Double> result = new java.util.ArrayList<>(sqRoots(y1));
        result.addAll(sqRoots(y2));
        return result;
    }

    /**
     * Пример
     * <p>
     * Выделить в список отрицательные элементы из заданного списка
     */
    public static List<Integer> negativeList(List<Integer> list) {
        List<Integer> result = new ArrayList<>();

        for (Integer element : list) {
            if (element < 0)
                result.add(element);
        }

        return result;
    }

    /**
     * Пример
     * <p>
     * Изменить знак для всех положительных элементов списка
     */
    public static List<Integer> invertPositives(List<Integer> list) {
        List<Integer> result = new ArrayList<>(list);

        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) > 0)
                result.set(i, -result.get(i));
        }

        return result;
    }

    /**
     * Пример
     * <p>
     * Из имеющегося списка целых чисел, сформировать список их квадратов
     */
    public static List<Integer> squares(List<Integer> list) {
        List<Integer> result = new ArrayList<>();

        list.forEach(it -> result.add(it * it));
        return result;
    }


    /**
     * Пример
     * <p>
     * По заданной строке str определить, является ли она палиндромом.
     * В палиндроме первый символ должен быть равен последнему, второй предпоследнему и т.д.
     * Одни и те же буквы в разном регистре следует считать равными с точки зрения данной задачи.
     * Пробелы не следует принимать во внимание при сравнении символов, например, строка
     * "А роза упала на лапу Азора" является палиндромом.
     */
    public static boolean isPalindrome(String str) {

        str = str.toLowerCase().replace(" ", "");

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
                return false;
        }
        return true;
    }

    /**
     * Пример
     * <p>
     * По имеющемуся списку целых чисел, например [3, 6, 5, 4, 9], построить строку с примером их суммирования:
     * 3 + 6 + 5 + 4 + 9 = 27 в данном случае.
     */
    public static String buildSumExample(List<Integer> list) {

        List<String> stringList = new ArrayList<>();
        int sum = 0;

        for (Integer element : list) {
            stringList.add(element.toString());
            sum = sum + element;
        }

        return String.join(" + ", stringList) + " = " + sum;
    }

    /**
     * Простая
     * <p>
     * Найти модуль заданного вектора, представленного в виде списка v,
     * по формуле abs = sqrt(a1^2 + a2^2 + ... + aN^2).
     * Модуль пустого вектора считать равным 0.0.
     */
    public static double abs(List v) {
        return 0.0;
    }

    /**
     * Простая
     * <p>
     * Рассчитать среднее арифметическое элементов списка list. Вернуть 0.0, если список пуст
     */
    public static double mean(List<Double> list) {
        return 0.0;
    }


    /**
     * Средняя
     * <p>
     * Центрировать заданный список list, уменьшив каждый элемент на среднее арифметическое всех элементов.
     * Если список пуст, не делать ничего. Вернуть изменённый список.
     * <p>
     * Обратите внимание, что данная функция должна изменять содержание списка list, а не его копии.
     */
    public static List<Double> center(List<Double> list) {
        return null;
    }

    /**
     * Средняя
     * <p>
     * Найти скалярное произведение двух векторов равной размерности,
     * представленные в виде списков a и b. Скалярное произведение считать по формуле:
     * C = a1b1 + a2b2 + ... + aNbN. Произведение пустых векторов считать равным 0.0.
     */
    public static double times(List<Double> a, List<Double> b) {

        return 0.0;
    }

    /**
     * Средняя
     * <p>
     * Рассчитать значение многочлена при заданном x:
     * p(x) = p0 + p1*x + p2*x^2 + p3*x^3 + ... + pN*x^N.
     * Коэффициенты многочлена заданы списком p: (p0, p1, p2, p3, ..., pN).
     * Значение пустого многочлена равно 0.0 при любом x.
     */
    public static double polynom(List<Double> p, double x) {
        return 0.0;
    }

    /**
     * Средняя
     * <p>
     * В заданном списке list каждый элемент, кроме первого, заменить
     * суммой данного элемента и всех предыдущих.
     * Например: 1, 2, 3, 4 -> 1, 3, 6, 10.
     * Пустой список не следует изменять. Вернуть изменённый список.
     * <p>
     * Обратите внимание, что данная функция должна изменять содержание списка list, а не его копии.
     */
    public static List<Double> accumulate(List<Double> list) {
        return null;
    }


    /**
     * Средняя
     * <p>
     * Разложить заданное натуральное число n > 1 на простые множители.
     * Результат разложения вернуть в виде списка множителей, например 75 -> (3, 5, 5).
     * Множители в списке должны располагаться по возрастанию.
     */
    public static List<Integer> factorize(int n) {
        return null;
    }

    /**
     * Сложная
     * <p>
     * Разложить заданное натуральное число n > 1 на простые множители.
     * Результат разложения вернуть в виде строки, например 75 -> 3*5*5
     * Множители в результирующей строке должны располагаться по возрастанию.
     */
    public static String factorizeToString(int n) {
        return null;
    }

    /**
     * Средняя
     * <p>
     * Перевести заданное целое число n >= 0 в систему счисления с основанием base > 1.
     * Результат перевода вернуть в виде списка цифр в base-ичной системе от старшей к младшей,
     * например: n = 100, base = 4 -> (1, 2, 1, 0) или n = 250, base = 14 -> (1, 3, 12)
     */
    public static List<Integer> convert(int n, int base) {
        return null;
    }

    /**
     * Сложная
     * <p>
     * Перевести заданное целое число n >= 0 в систему счисления с основанием 1 < base < 37.
     * Результат перевода вернуть в виде строки, цифры более 9 представлять латинскими
     * строчными буквами: 10 -> a, 11 -> b, 12 -> c и так далее.
     * Например: n = 100, base = 4 -> 1210, n = 250, base = 14 -> 13c
     */
    public static String convertToString(int n, int base) {
        return null;
    }

    /**
     * Средняя
     * <p>
     * Перевести число, представленное списком цифр digits от старшей к младшей,
     * из системы счисления с основанием base в десятичную.
     * Например: digits = (1, 3, 12), base = 14 -> 250
     */
    public static int decimal(List<Integer> digits, int base) {
        return 0;
    }

    /**
     * Сложная
     * <p>
     * Перевести число, представленное цифровой строкой str,
     * из системы счисления с основанием base в десятичную.
     * Цифры более 9 представляются латинскими строчными буквами:
     * 10 -> a, 11 -> b, 12 -> c и так далее.
     * Например: str = "13c", base = 14 -> 250
     */
    public static int decimalFromString(String str, int base) {
        return 0;
    }

    /**
     * Сложная
     * <p>
     * Перевести натуральное число n > 0 в римскую систему.
     * Римские цифры: 1 = I, 4 = IV, 5 = V, 9 = IX, 10 = X, 40 = XL, 50 = L,
     * 90 = XC, 100 = C, 400 = CD, 500 = D, 900 = CM, 1000 = M.
     * Например: 23 = XXIII, 44 = XLIV, 100 = C
     */
    public static String roman(int n) {
        return null;
    }

    /**
     * Очень сложная
     * <p>
     * Записать заданное натуральное число 1..999999 прописью по-русски.
     * Например, 375 = "триста семьдесят пять",
     * 23964 = "двадцать три тысячи девятьсот шестьдесят четыре"
     */
    public static String russian(int n) {
        return null;
    }


}
