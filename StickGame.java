import java.util.Scanner;

public class StickGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //ввод палочек
        long n = scanner.nextLong();
        
        // Счётчик палочек у Тани
        long tanyaSticks = 0;
        
        // Игра начинается с Тани
        boolean tanjaTurn = true;
        
        while (n > 0) {
            if (tanjaTurn) {
                if (n % 2 == 0) {
                    // Если чётное количество - Таня может взять 1 или n/2
                    // Таня выбирает половину, чтобы забрать больше
                    long take = n / 2;
                    tanyaSticks += take;
                    n -= take;
                } else {
                    // если нечётное - Таня может взять только 1
                    tanyaSticks += 1;
                    n -= 1;
                }
            } else {
                // Саша играет по стратегии "забрать как можно больше"
                if (n % 2 == 0) {
                    // Если чётное - Саша выбирает половину
                    long take = n / 2;
                    n -= take;
                } else {
                    // Если нечётное - Саша может взять только 1
                    n -= 1;
                }
            }
            
            // Передаём очередь другому игроку
            tanjaTurn = !tanjaTurn;
        }
        
        // Вывод результата - количество палочек у Тани
        System.out.println(tanyaSticks);
        
        scanner.close();
    }
}