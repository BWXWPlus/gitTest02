import java.util.Scanner;

public class Test {
   private static float []num = new float[100];
    private  static float min2 = 0, min1 = 0;
    public static void main(String[] args) {

        float min;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n-1; i++){
            num[i] = sc.nextFloat();
        }
        min = second(n);
        System.out.println(min);
    }
    public static float second(int n){

        two(0,n-1);
        return min2;
    }
    public static void  two(int i,int j){
            float lmin2 , lmin1, rmin2, rmin1;
            int mid;
            if(i ==j){
                min2 = min1 = num[i];
            }else if (i == j-1){
                if(num[i]<num[j]){
                    min2 = num[j];
                    min1 = num[i];
                }else {
                    min2 = num[i];
                    min1 = num[j];
                }
            }
    }

}
