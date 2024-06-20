package problem;

import java.util.Set;
import java.util.Stack;

public class BalanceamentoDeParenteses {

    public static boolean solve(String expression) {
        Set<Character> openSymbols = Set.of('(', '{', '[');
        Set<Character> closeSymbols = Set.of(')', '}', ']');
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (openSymbols.contains(c)) {
                stack.push(c);
            } else if (closeSymbols.contains(c)) {
                if (stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();
                if ((open == '(' && c != ')') ||
                        (open == '[' && c != ']') ||
                        (open == '{' && c != '}')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(solve("2*(3+4+5*[2+3)]"));
        System.out.println(solve("2*(3+4+5*[2+3]/(2+(3+(7+5)*9)*6)*[5+8]+17)+2]"));
    }
}

