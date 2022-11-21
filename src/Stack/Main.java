package Stack;

//Программа-калькулятор арифметических выражений, записанных в обратной польской нотации (RPN-калькулятор)

public class Main {
    public static void main(String[] args) {

        String str = "23456*+-/";
        char [] str_to_char = str.toCharArray();
        Stack RPN = new Stack(str_to_char.length);

        for(int i = 0; i<str_to_char.length; i++){
            if(str_to_char[i] == '+'){
                double x1 = RPN.pop();
                double x2 = RPN.pop();
                RPN.push(x1+x2);
            }
            if(str_to_char[i] == '-'){
                double x1 = RPN.pop();
                double x2 = RPN.pop();
                RPN.push(x2-x1);
            }
            if(str_to_char[i] == '*'){
                double x1 = RPN.pop();
                double x2 = RPN.pop();
                RPN.push(x1*x2);
            }
            if(str_to_char[i] == '/'){
                double x1 = RPN.pop();
                double x2 = RPN.pop();
                RPN.push(x2/x1);
            }
            if(str_to_char[i] != '+' && str_to_char[i] != '-' && str_to_char[i] != '*' && str_to_char[i] != '/'){
                int x = Character.getNumericValue(str_to_char[i]);
                RPN.push(x);
            }
        }
        System.out.println("Ответ: ");
        RPN.printStack();
    }
}
