package com.joy;

import java.util.ArrayList;
import java.util.List;

public class StringToArrayUtil {

    /**
     * parse String to Array and return the array
     * if it occurs Exception then return null
     */
    public static List<Integer> parseArray(String args) {
        List<Integer> result = new ArrayList<>();
        try {
            args = args.replaceAll(" ","");
            for(int i=0; i<args.length();i++){
                result.add(Integer.parseInt(args.charAt(i)+"") );
            }
        }catch (Exception e){
            result = null;
        }

        return result;
    }

}
