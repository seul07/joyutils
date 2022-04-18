package com.joy;

public class StringToArrayUtil {

    /**
     * parse String to Array and return the array
     * if it occurs Exception then return null
     */
    public static int[] parseArray(String args) {
        int[] result;
        try {
            String[] arr = args.trim().split(" ");
            final int SIZE = arr.length;
            result = new int[SIZE];
            for (int i = 0; i < SIZE; i++) {
                result[i] = Integer.parseInt(arr[i]);
            }
        } catch (Exception e) {
            result = null;
        }

        return result;
    }

}
