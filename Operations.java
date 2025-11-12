//Operations.java
public class Operations {
    public static void main(String[] args) {
        int a = 10, b = 3;

        // Arithmetic
        System.out.println("Addition: a + b = " + (a + b));
        System.out.println("Subtraction: a - b = " + (a - b));
        System.out.println("Multiplication: a * b = " + (a * b));
        System.out.println("Integer division: a / b = " + (a / b));
        System.out.println("Floating division: (double)a / b = " + ((double) a / b));
        System.out.println("Modulus: a % b = " + (a % b));

        // Compound assignment
        int c = a;
        c += b; // c = c + b
        System.out.println("Compound assignment c += b => c = " + c);

        // Unary operators
        int p = 10, q = 3;
        System.out.println("Pre-increment: ++p = " + (++p)); // p becomes 11, prints 11
        System.out.println("Post-increment: q++ (returns) = " + (q++) + ", now q = " + q); // prints 3 then q becomes 4

        // Relational and logical operators
        System.out.println("Relational: a > b = " + (a > b));
        System.out.println("Logical AND: (a > 5) && (b < 5) = " + ((a > 5) && (b < 5)));
        System.out.println("Logical OR: (a < 5) || (b < 5) = " + ((a < 5) || (b < 5)));

        // Bitwise operators
        System.out.println("Bitwise AND: a & b = " + (a & b));
        System.out.println("Left shift: a << 1 = " + (a << 1));
        System.out.println("Right shift: a >> 1 = " + (a >> 1));

        // Ternary operators
        System.out.println("Ternary: a is " + ((a % 2 == 0) ? "even" : "odd"));

        // Operator precedence example
        System.out.println("Precedence: a + b * 2 = " + (a + b * 2));
        System.out.println("With parentheses: (a + b) * 2 = " + ((a + b) * 2));
    }
}