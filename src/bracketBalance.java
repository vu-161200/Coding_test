import java.util.*;
public class bracketBalance {
    public static boolean isBalanced(String str) {
        Deque<Character> stack = new ArrayDeque<Character>();
        // Duyệt qua str để lấy ra các kí tự trong str
        for (int i=0;i < str.length();i++) {
            char ch = str.charAt(i);
            //Nếu kí tự là '(','{','[' đẩy vào stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            // Xét kí tự hiện tại với kí tư trên đỉnh ngăn xếp
            // Nếu là dấu đóng mở ngoặc tương ứng thì xóa khỏi ngăn xếp
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        // Kiểm tra Stack có rỗng hay không?
        // Nếu rỗng là chuỗi ngoặc cân bằng
        return stack.isEmpty();
    }
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         //System.out.print("Nhập số test case: ");
         int numberofTest = scanner.nextInt();
         scanner.nextLine();
         for(int i=0;i<numberofTest;i++)
         {
            String string = scanner.nextLine();
            boolean isBalanced=isBalanced(string);
            System.out.println(isBalanced);
            }
    }
}