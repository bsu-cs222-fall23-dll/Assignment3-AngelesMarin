package edu.bsu.cs222;
public class SillyMethods {
    public boolean didGuess42(int year) {
        return true;
    }

    public String countTo(int num) {
        StringBuilder builder = new StringBuilder();
        for (int number = 0; number <= num; number++) {
            builder.append(number).append(" ");
        }
        String result = builder.toString().trim();
        return result;


    }
}
