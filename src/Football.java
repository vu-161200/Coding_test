import java.util.Scanner;
public class Football {
    // Hàm tính giai thừa
    public static long factorial(int n) {
        long giaithua = 1;
        if (n == 0 || n == 1) {
            return giaithua;
        } else {
            for (int i = 2; i <= n; i++) {
                giaithua *= i;
            }
            return giaithua;
        }
    }
    // Hàm tính số cách đẻ đạt được tỉ số x y
    // Giả sử có x+y ô trống,ta chèn x ô vào trong x+y ô trống (không theo thứ tự)
    // =>Số cách :Tổ hợp chập x của x+y phần tử
    public static long numberOfWayScore(int x,int y){
        int way=0;
        if(x==0 && y==0){
            return 0;
        }
        else if(x==0 || y==0){
            return 1;
        }
        else{
            return factorial(x+y)/(factorial(x)*factorial(y));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Nhập số test case: ");
        int numberofTest = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<numberofTest;i++) {
            String string = scanner.nextLine();
            String[] input = string.split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            long numberOfWays = numberOfWayScore(a, b);
            System.out.println(numberOfWays);
        }
    }
}
