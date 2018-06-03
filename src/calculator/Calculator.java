package calculator;

public class Calculator{
    static float answer;
    public static void main(String[] args) {
        System.out.println("\n1.Add\n2.Subtract\n3.Divide\n4.Multiply\n");
        basicVariables variables    = basicVariables.getVariables();
        calculatorHelper calculator = new calculatorHelper(new calculations());
        int choice                  = variables.getChoice();
       answer =   calculator.useChoice(choice,variables.getFirst(),variables.getSecond());
        System.out.println("the answer is :"+ answer );



    }


}