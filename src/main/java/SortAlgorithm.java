public class SortAlgorithm {

    /**
     * 冒泡排序
     * @param a 待排序数组
     */
    public static void bubbleSort(int[] a){
        int tmp,n,lastIndexOfSwap=a.length;
//        boolean isSwaped=true;
        while(lastIndexOfSwap>1){
//        for(int i=0;i<a.length;i++){
//            if(!isSwaped)
//                break;
//            isSwaped=false;
            n=0;
            for(int j=1;j<lastIndexOfSwap;j++){
                if(a[j]<a[j-1]){//交换
                    tmp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=tmp;
//                    isSwaped=true;
                    n=j;
                }
            }
            lastIndexOfSwap=n;
        }
    }

    /**
     * 快速排序
     * @param a
     */
    public static void quickSort(int[] a,int low,int high){
        if(low<high){
            int split=a[low];
            int i=low,j=high;
            while(i<j) {
                while (i < j && a[j] >=split)
                    j--;
                a[i]=a[j];
                while(i<j&&a[i]<=split)
                    i++;
                a[j]=a[i];
            }
            a[i]=split;
            quickSort(a,low,i-1);
            quickSort(a,i+1,high);
        }
    }

    /**
     * 插入排序
     * @param a
     */
    public static void insertSort(int[] a){
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1]){
                int tmp=a[i];
                a[i]=a[i-1];
                int j=i-1;
                while(j>=0&&tmp<a[j]) {
                    a[j+1]=a[j];
                    j--;
                }
                a[j+1]=tmp;
            }
        }
    }

    /**
     * 选择排序
     * @param a
     */
    public static void selectSort(int[] a){
        int tmp;
        for(int i=0;i<a.length;i++){
            int min=a[i],indexOfMin=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<min) {
                    indexOfMin = j;
                    min=a[j];
                }
            }
            tmp=a[i];
            a[i]=a[indexOfMin];
            a[indexOfMin]=tmp;
        }
    }

    /**
     * 堆排序
     * @param a
     */
    public static void heapSort(int[] a){
        //建立大顶堆
        for(int i=a.length/2-1;i>=0;i--){
            adjustHeap(a,i,a.length);
        }
        //交换堆顶元素与最后一个元素
        for(int i=0;i<a.length;i++){
            int tmp=a[0];
            a[0]=a[a.length-i-1];
            a[a.length-i-1]=tmp;
            adjustHeap(a,0,a.length-i-1);
        }

    }

    /**
     * 调整堆
     * @param a
     * @param index 待调整节点位置
     * @param length 堆内节点个数
     */
    private static void adjustHeap(int[] a,int index,int length){
        int left=index*2+1;
        while (left<length){
            if (left + 1 < length && a[left] < a[left+1]) {
                left++;
            }
            if(a[left]>a[index]){
                int tmp=a[index];
                a[index]=a[left];
                a[left]=tmp;
                index=left;
                left=left*2+1;
            }else{
                break;
            }
        }
    }
}
