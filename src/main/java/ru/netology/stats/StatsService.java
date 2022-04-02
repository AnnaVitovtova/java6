package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calcAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int findMax(int[] sales) {
        int currentMax = sales[0];
        for (int sale : sales) {
            if (sale > currentMax) {
                currentMax = sale;
            }
        }
        return currentMax;
    }

    public int findMin(int[] sales) {
        int currentMax = sales[0];
        for (int sale : sales) {
            if (sale < currentMax) {
                currentMax = sale;
            }
        }
        return currentMax;
    }

    public int minSales(int[] sales) {
int avg = this.calcAvg(sales);

        int sumMinMonth = 0;
        for (int sale : sales) {
            if (sale < avg) {
                sumMinMonth =sumMinMonth+1;
            }

        }
        return sumMinMonth;
    }
    public int maxSales(int[] sales) {
        int avg = this.calcAvg(sales);

        int sumMaxMonth = 0;
        for (int sale : sales) {
            if (sale > avg) {
                sumMaxMonth =sumMaxMonth+1;
            }

        }
        return sumMaxMonth;
    }
}


