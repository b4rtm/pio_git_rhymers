package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NUMBERS_MAX_SIZE = 12;

    private static final int IS_EMPTY_INDICATOR = -1;

    private static final int DEFAULT_RETURN_VALUE = -1;
    private final int[] numbers = new int[NUMBERS_MAX_SIZE];

    private int total = IS_EMPTY_INDICATOR;


    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == IS_EMPTY_INDICATOR;
    }

    public boolean isFull() {
        return total == NUMBERS_MAX_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total--];
    }

}
