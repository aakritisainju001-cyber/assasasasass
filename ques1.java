
/**
 * Write a description of class ques1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ques1

 {   public static void main(String[] args) {

        // 1. ARITHMETIC OPERATORS
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println();
        
        // 2. UNARY OPERATORS
        int x = 5;
        System.out.println("Unary Operators:");
        System.out.println("x = " + x);
        System.out.println("x++ = " + (x++)); // Post-increment
        System.out.println("After x++ , x = " + x);
        System.out.println("++x = " + (++x)); // Pre-increment
        System.out.println("After ++x , x = " + x);
        System.out.println();

        // 3. ASSIGNMENT OPERATORS
        int y = 20;
        System.out.println("Assignment Operators:");
        System.out.println("y = " + y);
        y += 5; // y = y + 5
        System.out.println("y += 5 --> " + y);
        y -= 3; // y = y - 3
        System.out.println("y -= 3 --> " + y);
        y *= 2; // y = y * 2
        System.out.println("y *= 2 --> " + y);
        y /= 4; // y = y / 4
        System.out.println("y /= 4 --> " + y);
        System.out.println();

        // 4. RELATIONAL OPERATORS
        int p = 7, q = 10;
        System.out.println("Relational Operators:");
        System.out.println("p == q : " + (p == q));
        System.out.println("p != q : " + (p != q));
        System.out.println("p < q  : " + (p < q));
        System.out.println("p > q  : " + (p > q));
        System.out.println("p <= q : " + (p <= q));
        System.out.println("p >= q : " + (p >= q));
        System.out.println();

        // 5. LOGICAL OPERATORS
        boolean cond1 = true, cond2 = false;
        System.out.println("Logical Operators:");
        System.out.println("cond1 && cond2 : " + (cond1 && cond2));
        System.out.println("cond1 || cond2 : " + (cond1 || cond2));
        System.out.println("!cond1 : " + (!cond1));
        System.out.println();

        // 6. TERNARY OPERATOR
        int num = 15;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Ternary Operator:");
        System.out.println(num + " is " + result);
    }
}