package com.joy;

import java.util.ArrayList;
import java.util.List;

public class StringToArrayUtil {

    /**
     * parse String to Array and return the array
     * if it occurs Exception then return null
     */
    public static int[] parseArray(String args) {
        int[] result = new int[0];
//        List<Integer> result = new ArrayList<>();
        try {
            args = args.replaceAll(" ","");
            result = new int[args.length()];
            for(int i=0; i<args.length();i++){
                result[i] = Integer.parseInt(args.charAt(i)+"");
//                result.add(Integer.parseInt(args.charAt(i)+"") );
            }
        }catch (Exception e){
            result = null;
        }

        return result;
    }

}
