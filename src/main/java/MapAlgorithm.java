public class MapAlgorithm {

    /**
     * prim 算法求最小生成树
     * @param a 图的邻接矩阵表示
     * @param vNum 顶点个数
     */
    public static void miniSpanTree_prim(int[][] a,int vNum){
        int min,i,j,k;
        int[] adjvex=new int[vNum];//保存相关顶点下标 a[i]=j,表示边i->j
        int[] lowcost=new int[vNum];//保存相关顶点间边的权值,0表示顶点已经选中
        lowcost[0]=0;
        adjvex[0]=0;
        //以顶点0为起点，初始化adjvex和lowcost
        for(i=1;i<vNum;i++){
            lowcost[i]=a[0][i];
            adjvex[i]=0;
        }
        for(i=1;i<vNum;i++){
            min=Integer.MAX_VALUE;
            j=1;k=0;
            //找lowcost中权值最小的边，k记录这个点
            while (j<vNum){
                if(lowcost[j]!=0&&lowcost[j]<min){
                    min=lowcost[j];
                    k=j;
                }
                j++;
            }
            //这个边成为最小生成树一部分
            System.out.println("("+adjvex[k]+","+k+")");
            lowcost[k]=0;
            //针对新加入的k顶点，从k顶点出发判断k到其他顶点的权值，修正lowcost和adjvex
            for(j=1;j<vNum;j++){
                if(lowcost[j]!=0&&a[k][j]<lowcost[j]){
                    lowcost[j]=a[k][j];
                    adjvex[j]=k;
                }
            }
        }
    }
}
