// Hoàn thành:giết m con quái vật
// Kiếm có độ bền d
// Mỗi lần giết 1 con quái đồ bề giảm k
// Sửa độ bền tốn c gold/1 lần(phục hồi độ bền như ban đầu)
// Hỏi:Tốn tổi thiếu bn goal để qua màn
// Input: m=10,d=5,k=1,c=2
// Output:4
import java.util.Scanner;
public class Diablo {
    public static int minGoal(int m,int d,int k,int c) {
        // Muốn cost tối thiếu thì độ bền phải thấp nhất thì mới sửa
        int current_durability = d;
        int gold_used = 0;
        for (int i = 0; i < m; i++) {
            //Giết một con quái vật thì giảm độ bền đi k
            current_durability -= k;
            // Trường hợp đối với quái vật cuối nếu độ bền =0 thì không phải phục hồi vũ khí
            if(i==m-1&& current_durability==0){
                gold_used=gold_used;
            }
            //Kiểm tra vũ khí còn sử dụng được không?
            if (current_durability <=0) {
                //Sửa đồ để hồi độ bền
                current_durability = d;
                gold_used += c;
            }
        }
        return gold_used;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] input = string.split(" ");

        int m=Integer.parseInt(input[0]);
        int d=Integer.parseInt(input[1]);
        int k=Integer.parseInt(input[2]);
        int c=Integer.parseInt(input[3]);
        int gold_needed =minGoal(m,d,k,c);
        System.out.print(gold_needed);
        }
    }

