package calculator;

public class calculatorHelper {
    private Operators operators;
    float answer;

    public calculatorHelper(Operators operators){
        this.operators = operators;
    }

    public void executeAdd(float first, float second){
         answer = (int)operators.add(first,second);

    }
    public void executeSub(float first, float second){
        answer = operators.sub(first,second);

    }
    public void executeDiv(float first, float second){
        answer = operators.div(first,second);

    }
    public void executeMul(float first, float second){
        answer = operators.mul(first,second);

    }

    public float useChoice(int choice, float first, float second){
        switch (choice){
            case 1:
                executeAdd(first,second);
                break;
            case 2:
                executeSub(first,second);
                break;
            case 3:
                executeDiv(first,second);
                break;
            case 4:
                executeMul(first,second);
                break;
            case 5:
                break;

        }
return answer;
    }

}
