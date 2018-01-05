public class FirmProfit{

    public static void main(String[] args) {
        System.out.println(getMaximumProfitFromOrders(3, new int[]{1,1,1,1}));
        System.out.println(getMaximumProfitFromOrders(4, new int[]{11,2}));
        System.out.println(getMaximumProfitFromOrders(4, new int[]{8, 2, 9, 17, 4, 4, 10}));
    }

    public static int getMaximumProfitFromOrders(int hours, int[] orderPrices){
        int sum=0;
        /*Если количество часов больше либо ровно количеству заказов
            то просто суммируем все суммы заказов*/
        if(hours>=orderPrices.length){
            for(int i = 0; i<orderPrices.length;i++){
                sum+=orderPrices[i];
            }
            return sum;
        /*Если количество часов меньше чем количество заказов, то берем заказы с самой большой ценой.
        Массив сортируем любой сортировкой от большего к меньшему.*/
        }else{
            orderPrices = bubbleSort(orderPrices);
            for (int i = 0; i < hours; i++){
                sum+=orderPrices[i];
            }
            return sum;
        }
    }
    private static int[] bubbleSort(int[] arr){//стандартная сортировка массива пузырьком от большего к меньшему
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] < arr[j+1] ) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
