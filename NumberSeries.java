import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Чтение входных данных
        int start = scanner.nextInt();    // начало ряда
        int step = scanner.nextInt();     // шаг
        int count = scanner.nextInt();    // количество шагов
        
        // Вывод чисел ряда
        for (int i = 0; i <= count; i++) {
            int number = start + i * step;
            System.out.print(number);
            
            // Добавляем запятую, если это не последнее число
            if (i < count) {
                System.out.print(", ");
            }
        }
        
        System.out.println();
        scanner.close();
    }
}