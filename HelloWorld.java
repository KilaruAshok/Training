import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}};
        int[][] b = {{4,5},{6,7}};
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of matrix")
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
