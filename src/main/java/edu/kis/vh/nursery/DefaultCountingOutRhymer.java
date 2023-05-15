package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NUMBERS_MAX_SIZE = 12;

    private static final int IS_EMPTY_INDICATOR = -1;

    private static final int DEFAULT_RETURN_VALUE = -1;
    private final int[] numbers = new int[NUMBERS_MAX_SIZE];

    private int total = IS_EMPTY_INDICATOR;

    /**
     *
     * @return index of last element of numbers array
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param in number which will be added to the numbers array
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * @return true if numbers array is empty, false if it is not empty
     */
    public boolean callCheck() {
        return total == IS_EMPTY_INDICATOR;
    }

    /**
     * @return true if numbers array is full, false if it is not full
     */
    public boolean isFull() {
        return total == NUMBERS_MAX_SIZE - 1;
    }

    /**
     * @return DEFAULT_RETURN_VALUE if numbers array is empty, last number in numbers array if it is not empty
     */
    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total];
    }


    /**
     * @return DEFAULT_RETURN_VALUE if numbers array is empty, last number in numbers array if it is not empty
     * it dectrements total
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total--];
    }

}
