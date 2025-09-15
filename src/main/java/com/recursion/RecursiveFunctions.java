package com.recursion;

import java.util.List;

public class RecursiveFunctions {

    public static int recursiveIndexOf(List<String> list, String target) {
        return recursiveIndexOfHelper(list,target,0);
    }
    private static int recursiveIndexOfHelper(List<String> list, String target, int index) {
        if (index >= list.size()) {
            return -1;
        }
        if (list.get(index).equals(target)) {
            return index;
        }
        return recursiveIndexOfHelper(list,target,index+1);
    }

    public static int recursiveIndexOfByIndex(List<String> list, String target, int index) {
        return recursiveIndexOfHelper(list,target,index);
    }
    private static int recursiveIndexOfHelperByIndex(List<String> list, String target, int index) {
        if (index >= list.size()) {
            return -1;
        }
        if (list.get(index).equals(target)) {
            return index;
        }
        return recursiveIndexOfHelperByIndex(list,target,index+1);
    }

    public static int recursiveIndexOfEmpty(List<String> list) {
        return recursiveIndexOfHelper(list,"",0);
    }
    private static int recursiveIndexOfHelperEmpty(List<String> list, String target) {
        if (list.isEmpty()) {
            return -1;
        }
        return recursiveIndexOfHelper(list,target,0);
    }


    public static int recursivePut(String target, List<String> list) {
        return recursivePutHelper(target,list,0);
    }
    private static int recursivePutHelper(String target, List<String> list, int index) {
        if (index >= list.size()) {
            return -1;
        }
        if (list.get(index) == null || list.get(index).isEmpty()) {
            list.set(index,target);
            return index;
        }
        return recursivePutHelper(target,list,index+1);
    }

    public static int recursiveRemove(List<String> list, String target) {
        return recursiveRemoveHelper(target,list,0);
    }
    private  static int recursiveRemoveHelper(String target, List<String> list, int index) {
        if (index >= list.size()) {
            return 0;
        }
        if (list.get(index) != null && list.get(index).equals(target)) {
            list.remove(index);
            return 1 + recursiveRemoveHelper(target,list,index);
        }else {
            return recursiveRemoveHelper(target,list,index+1);
        }

    }

    public static int recursiveSum(List<Integer> list) {
        return recursiveSumHelper(list,0);
    }
    private static int recursiveSumHelper(List<Integer> list, int index) {
        if (index >= list.size()) {
            return 0;
        }
        return list.get(index) + recursiveSumHelper(list,index+1);

    }

    public static int recursiveFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }

    public static int recursivePow(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * recursivePow(base, exponent - 1);
    }

    public static int recursiveFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static boolean recursivePalindrome(String word) {
       if (word.length() <= 1) {
           return true;
       }
       if (word.charAt(0) != word.charAt(word.length() - 1)) {
           return false;
       }
       return recursivePalindrome(word.substring(1, word.length() - 1));
    }


}

