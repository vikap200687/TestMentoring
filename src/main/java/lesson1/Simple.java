package lesson1;

//import kotlin.Metadata;

/*@Metadata(
        mv = {1, 1, 18},
        bv = {1, 0, 3},
        k = 2,
        d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0016\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003\u001a\u001e\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001\u001a\u001e\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003\u001a\u0019\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\u0010\u0016\u001a\u000e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003\u001a\u001e\u0010\u0019\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001\u001a\u001e\u0010\u001a\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001\u001a\u001e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003\u001a\u000e\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0001\u001a\u000e\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003\u001a\u000e\u0010 \u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003\u001a&\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0001\u001a&\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0003¨\u0006+"},
        d2 = {"accountInThreeYears", "", "initial", "", "percent", "angleInRadian", "grad", "min", "sec", "discriminant", "a", "b", "c", "lengthInMeters", "sagenes", "arshins", "vershoks", "main", "", "args", "", "", "([Ljava/lang/String;)V", "numberRevert", "number", "quadraticEquationRoot", "quadraticRootProduct", "seconds", "hours", "minutes", "sqr", "x", "thirdDigit", "trackLength", "x1", "y1", "x2", "y2", "travelMinutes", "hoursDepart", "minutesDepart", "hoursArrive", "minutesArrive", "kfirst"}
)*/
public final class Simple {

    /**
     * Пример
     * <p>
     * Вычисление квадрата целого числа
     */
    public static final int sqr(int x) {
        return x * x;
    }


    /**
     * Пример
     * <p>
     * Вычисление квадрата вещественного числа
     */
    public static final double sqr(double x) {
        return x * x;
    }


    /**
     * Пример
     * <p>
     * Вычисление дискриминанта квадратного уравнения
     */
    public static final double discriminant(double a, double b, double c) {
        return sqr(b) - (double) 4 * a * c;
    }


    /**
     * Пример
     * <p>
     * Поиск одного из корней квадратного уравнения
     */
    public static final double quadraticEquationRoot(double a, double b, double c) {
        double var10000 = -b;
        double var6 = discriminant(a, b, c);
        return (var10000 + Math.sqrt(var6)) / ((double) 2 * a);
    }


    /**
     * Пример
     * <p>
     * Поиск произведения корней квадратного уравнения
     */
    public static final double quadraticRootProduct(double a, double b, double c) {
        double x1 = discriminant(a, b, c);
        double sd = Math.sqrt(x1);
        x1 = (-b + sd) / ((double) 2 * a);
        double x2 = (-b - sd) / ((double) 2 * a);
        return x1 * x2;
    }


    /**
     * Пример главной функции
     * Можно попробовать её запустить по кнопке Play рядом с названием функции
     */
    public static void main(String[] args) {
        double x1x2 = quadraticRootProduct(1.0, 13.0, 42.0);
        String var3 = "Root product: " + x1x2;
        System.out.println(var3);
    }


    /**
     * Тривиальная
     * <p>
     * Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
     * Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае).
     */
    public static int seconds(int hours, int minutes, int seconds) {
        return 0;
    }


    /**
     * Тривиальная
     * <p>
     * Пользователь задает длину отрезка в саженях, аршинах и вершках (например, 8 саженей 2 аршина 11 вершков).
     * Определить длину того же отрезка в метрах (в данном случае 18.98).
     * 1 сажень = 3 аршина = 48 вершков, 1 вершок = 4.445 см.
     */
    public static double lengthInMeters(int sagenes, int arshins, int vershoks) {
        return 0;
    }


    /**
     * Тривиальная
     * <p>
     * Пользователь задает угол в градусах, минутах и секундах (например, 36 градусов 14 минут 35 секунд).
     * Вывести значение того же угла в радианах (например, 0.63256).
     */
    public static double angleInRadian(int grad, int min, int sec) {
        return 0;
    }


    /**
     * Тривиальная
     * <p>
     * Найти длину отрезка, соединяющего точки на плоскости с координатами (x1, y1) и (x2, y2).
     * Например, расстояние между (3, 0) и (0, 4) равно 5
     */
    public static double trackLength(double x1, double y1, double x2, double y2) {
        return 0;
    }


    /**
     * Простая
     * <p>
     * Пользователь задает целое число, большее 100 (например, 3801).
     * Определить третью цифру справа в этом числе (в данном случае 8).
     */
    public static int thirdDigit(int number) {
        return 0;
    }


    /**
     * Простая
     * <p>
     * Поезд вышел со станции отправления в h1 часов m1 минут (например в 9:25) и
     * прибыл на станцию назначения в h2 часов m2 минут того же дня (например в 13:01).
     * Определите время поезда в пути в минутах (в данном случае 216).
     */
    public static int travelMinutes(int hoursDepart, int minutesDepart, int hoursArrive, int minutesArrive) {
        return 0;
    }


    /**
     * Простая
     * <p>
     * Человек положил в банк сумму в s рублей под p% годовых (проценты начисляются в конце года).
     * Сколько денег будет на счету через 3 года (с учётом сложных процентов)?
     * Например, 100 рублей под 10% годовых превратятся в 133.1 рубля
     */
    public static double accountInThreeYears(int initial, int percent) {
        return 0;
    }


    /**
     * Простая
     * <p>
     * Пользователь задает целое трехзначное число (например, 478).
     * Необходимо вывести число, полученное из заданного перестановкой цифр в обратном порядке (например, 874).
     */
    public static int numberRevert(int number) {
        return 0;
    }
}