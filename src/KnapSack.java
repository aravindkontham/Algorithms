public class KnapSack {
    static int max(int a,int b){
        return(a>b)?a:b;
    }
    static int knasack(int val[],int wt[],int n,int W){
        int T[][]=new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                if(i==0 || j==0)
                    T[i][j]=0;
                else if(wt[i-1]<=j){
                    T[i][j]=max(T[i-1][j-wt[i-1]]+val[i-1],T[i-1][j]);
                }
                else
                    T[i][j]=T[i-1][j];
            }
        }
        return T[n][W];
    }
    public static void main(String[] args) {
        int val[]= new int[]{60,100,120};
        int wt[]=new int[]{10,20,30};
        int n=val.length;
        int W=50;
        System.out.println(knasack(val,wt,n,W));
    }
}
