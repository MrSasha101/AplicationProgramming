/**
 * Клас, що представляє число Люка з його позицією у послідовності.
 */
public class LykeNumb {
    /** Позиція числа у списку */
    private long numbinlist;

    /** Значення числа Люка */
    private long number;

    /**
     * Конструктор для створення числа Люка.
     *
     * @param numbinlist порядковий номер у послідовності
     * @param number значення числа Люка
     */
    LykeNumb(long numbinlist, long number){
        this.numbinlist = numbinlist;
        this.number = number;
    }

    /**
     * Повертає позицію числа у списку.
     *
     * @return номер у послідовності
     */
    public long getNumbinlist() {
        return numbinlist;
    }

    /**
     * Повертає значення числа Люка.
     *
     * @return число Люка
     */
    public long getNumber() {
        return this.number;
    }

    /**
     * Перевіряє, чи задовольняє число умові {@code number = w^2 - 1}.
     *
     * @return 1, якщо умова виконується; 0 – якщо ні
     */
    public int check() {
        long sqrt = (long) Math.sqrt(number + 1);
        if (sqrt * sqrt == number + 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
