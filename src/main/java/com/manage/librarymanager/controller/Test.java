package com.manage.librarymanager.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test {

    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();
        ls.add(100);
        ls.add(80);
        ls.add(60);
        ls.add(70);
        ls.add(60);
        ls.add(74);
        ls.add(86);


        System.out.println(findSpan(ls));


    }

    public static List<Integer> findSpan(List<Integer> arr) {

        List<Integer> ans = new ArrayList<>();


        Stack<Integer> st = new Stack<>();
        int count  = 1;

        for(int i = 0 ; i < arr.size(); i++) {


            while(!st.isEmpty() && arr.get(st.peek()) < arr.get(i)) {
                count += ans.get(st.pop());
            }

            st.push(i);
            ans.add(count);

            count =1;



        }



        return ans;

    }



}
