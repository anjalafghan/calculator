package calculator;

import java.util.Scanner;

final class basicVariables{

    private final float first;
    private final float second;
    private int choice;

    private basicVariables(float first, float second, int choice){
        this.first  = first;
        this.second = second;
        this.choice = choice;
    }

    float getFirst() {
        return first;
    }

    float getSecond() {
        return second;
    }

    int getChoice() {
        return choice;
    }

    static basicVariables getVariables(){
        Scanner reader  = new Scanner(System.in);
        System.out.println("Enter first value");
        float first     = reader.nextFloat();
        System.out.println("Enter second value");
        float second    = reader.nextFloat();
        System.out.println("Enter your choice");
        int choice      = reader.nextInt();

        return new basicVariables(first, second, choice);
    }

}



