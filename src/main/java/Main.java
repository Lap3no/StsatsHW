import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.calculateSum(sales));

        int[] averageSum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.calculateAverageSum(averageSum));

        long[] salesMin = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.calculateMinMonth(salesMin));

        long[] salesMax = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.calculateMaxMonth(salesMax));

        int[] aboveAverageSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.calculateCounterUnderAverage(aboveAverageSale));

        int[] belowAverageSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.calculateCounterUpperAverage(belowAverageSale));
    }
}