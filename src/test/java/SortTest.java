import org.junit.Test;

public class SortTest {

    @Test
    public void test(){
        int[] a={39,20,16,56,78,95,46};
        System.out.println("冒泡排序：");
        SortAlgorithm.bubbleSort(a);
        printArray(a);
        int[] b={39,20,16,56,78,95,46};
        System.out.println("快速排序：");
        SortAlgorithm.quickSort(b,0,b.length-1);
        printArray(b);
        int[] c={39,20,16,56,78,95,46};
        System.out.println("插入排序：");
        SortAlgorithm.insertSort(c);
        printArray(c);
        int[] d={39,20,16,56,78,95,46};
        System.out.println("选择排序：");
        SortAlgorithm.selectSort(d);
        printArray(d);
        int[] e={39,20,16,56,78,95,46};
        System.out.println("堆排序：");
        SortAlgorithm.heapSort(e);
        printArray(e);
    }
    @Test
    public void testMap(){
        int[][] a={
                {0,10,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,      11,         Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                {10,0,18,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,      16,         Integer.MAX_VALUE,      12          },
                {Integer.MAX_VALUE,18,0,22,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,8},
                {Integer.MAX_VALUE,Integer.MAX_VALUE,22,0,20,Integer.MAX_VALUE,24,16,21},
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,20,0,26,Integer.MAX_VALUE,7,Integer.MAX_VALUE},
                {11,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,26,0,17,Integer.MAX_VALUE,Integer.MAX_VALUE},
                {Integer.MAX_VALUE,16,Integer.MAX_VALUE,24,Integer.MAX_VALUE,17,0,19,Integer.MAX_VALUE},
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,16,7,Integer.MAX_VALUE,19,0,Integer.MAX_VALUE},
                {Integer.MAX_VALUE,12,8,21,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,0}
        };
        System.out.println("Prim算法求最小生成树：");
        MapAlgorithm.miniSpanTree_prim(a,9);
    }

    public void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

}
